package app.domain.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import app.domain.exception.BussinesException;
import app.domain.exception.NotFoundException;
import app.domain.models.BankAccount;
import app.domain.models.Bitacora;
import app.domain.models.enums.AccountStatus;
import app.domain.models.enums.AccountType;
import app.domain.models.enums.Currency;
import app.domain.ports.BankAccountPort;
import app.domain.ports.BitacoraPort;


public class BankAccountService {

    private final BankAccountPort bankAccountPort;
    private final BitacoraPort bitacoraPort;
    private final ClientService clientService;

    public BankAccountService(BankAccountPort bankAccountPort,
                               BitacoraPort bitacoraPort,
                               ClientService clientService) {
        this.bankAccountPort = bankAccountPort;
        this.bitacoraPort = bitacoraPort;
        this.clientService = clientService;
    }

    //Abre una nueva cuenta bancaria para un cliente.
    public BankAccount openAccount(String idTitular,
                                   String accountNumber,
                                   AccountType accountType,
                                   Currency currency,
                                   BigDecimal initialBalance,
                                   Long operatorUserId,
                                   String operatorRole) {

        // 1. Validar que el cliente esté activo
        clientService.validateClientIsActive(idTitular);

        // 2. Validar unicidad del número de cuenta
        if (bankAccountPort.existsByAccountNumber(accountNumber)) {
            throw new BussinesException(
                "Account number " + accountNumber + " already exists in the system.");
        }

        // 3. Validar saldo inicial
        if (initialBalance == null || initialBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new BussinesException("Initial balance cannot be negative.");
        }

        // 4. Construir y guardar la cuenta
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setIdTitular(idTitular);
        account.setCurrentBalance(initialBalance);
        account.setCurrency(currency);
        account.setAccountStatus(AccountStatus.Active);
        account.setOpeningDate(LocalDate.now());

        bankAccountPort.save(account);

        // 5. Registrar en Bitácora
        registrarAperturaCuenta(account, operatorUserId, operatorRole);

        return account;
    }

    // Consultas

    //Obtiene una cuenta por su número.
    public BankAccount getByAccountNumber(String accountNumber) {
        return bankAccountPort.findByAccountNumber(accountNumber)
            .orElseThrow(() -> new NotFoundException(
                "Bank account " + accountNumber + " not found."));
    }

    public List<BankAccount> getAccountsByTitular(String idTitular) {
        return bankAccountPort.findByTitular(idTitular);
    }

    public List<BankAccount> getAllAccounts() {
        return bankAccountPort.findAll();
    }

    // Validaciones reutilizables por otros servicios

    //Valida que una cuenta exista y esté activa para recibir operaciones.
    public BankAccount validateAccountIsOperational(String accountNumber) {
        BankAccount account = bankAccountPort.findByAccountNumber(accountNumber)
            .orElseThrow(() -> new NotFoundException(
                "Bank account " + accountNumber + " not found."));

        if (account.getAccountStatus() == AccountStatus.Blocked
                || account.getAccountStatus() == AccountStatus.Cancelled) {
            throw new BussinesException(
                "Account " + accountNumber + " is " + account.getAccountStatus()
                    + ". Operations are not allowed on blocked or cancelled accounts.");
        }
        return account;
    }

    //Valida que una cuenta activa pertenezca a un titular específico.
    public BankAccount validateAccountBelongsToClient(String accountNumber, String idTitular) {
        BankAccount account = validateAccountIsOperational(accountNumber);

        if (!account.getIdTitular().equals(idTitular)) {
            throw new BussinesException(
                "Account " + accountNumber + " does not belong to client " + idTitular + ".");
        }
        return account;
    }

    // Métodos privados
    private void registrarAperturaCuenta(BankAccount account, Long operatorUserId, String operatorRole) {
        Bitacora registro = Bitacora.builder()
            .idBitacora(UUID.randomUUID().toString())
            .operationType("ACCOUNT_OPENED")
            .operationDateTime(LocalDateTime.now())
            .idUser(operatorUserId)
            .rolUser(operatorRole)
            .idProductoAfectado(account.getAccountNumber())
            .detailData(Map.of(
                "accountNumber", account.getAccountNumber(),
                "accountType", account.getAccountType().name(),
                "idTitular", account.getIdTitular(),
                "initialBalance", account.getCurrentBalance(),
                "currency", account.getCurrency().name(),
                "openingDate", account.getOpeningDate().toString()
            ))
            .build();

        bitacoraPort.save(registro);
    }
}
