package app.domain.ports;

import java.util.List;
import java.util.Optional;

import app.domain.models.Loan;
import app.domain.models.enums.LoanStatus;

public interface LoanPort {

    Optional<Loan> findById(Long loanId);

    List<Loan> findByClient(String clientId);

    List<Loan> findByClientAndStatus(String clientId, LoanStatus status);

    List<Loan> findByStatus(LoanStatus status);

    List<Loan> findAll();

    boolean existsById(Long loanId);

    void save(Loan loan);

    void update(Loan loan);
}
