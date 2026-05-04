package app.domain.models;
import java.math.BigDecimal;

import app.domain.models.enums.AccountStatus;
import app.domain.models.enums.AccountType;
import app.domain.models.enums.Currency;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "bank_accounts")
@Getter
@Setter
@NoArgsConstructor

public class BankAccount {

    @Id
    @Column(nullable = false, unique = true)
    private String accountNumber;
    private AccountType accountType;
    private String idTitular;
    private BigDecimal currentBalance;
    private Currency currency;
    private AccountStatus accountStatus;
    private LocalDate openingDate;

}
