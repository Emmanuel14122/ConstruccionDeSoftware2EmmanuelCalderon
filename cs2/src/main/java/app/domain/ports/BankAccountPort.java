package app.domain.ports;

import java.util.List;

import app.domain.models.BankAccount;
import app.domain.models.Client;

public interface BankAccountPort {
    //find
    public BankAccount findById(String id);
    public List<BankAccount> findByCustomer(Client client);
    //exists
    public boolean existsByNumber(long accountNumber);
    public boolean existsById(String id);
    //operation
    public void save(BankAccount bankAccount);
    public void update(BankAccount bankAccount);
}
