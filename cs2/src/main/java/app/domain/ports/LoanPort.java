package app.domain.ports;

import java.util.List;

import app.domain.models.Client;
import app.domain.models.Loan;

public interface LoanPort {
    //find
    public Loan findById(String id);
    public List<Loan> findByCustomer(Client client);
    //exists
    public boolean existsById(String id);
    //operation
    public void save(Loan loan);
    public void update(Loan loan);
}
