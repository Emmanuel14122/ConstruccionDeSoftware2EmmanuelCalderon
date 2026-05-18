package app.application.adapters.persistence.sql.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import app.domain.models.enums.LoanStatus;
import app.domain.models.enums.LoanType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loans")
@Getter
@Setter

public class LoanEntity {
    
    @Id
    private Long loanId;
    private LoanType loanType;
    private String clientRequestorId;
    private BigDecimal requestedAmount;
    private BigDecimal approvedAmount;
    private BigDecimal interestRate;
    private int termMonths;
    private LoanStatus loanStatus;
    private LocalDate approvalDate;
    private LocalDate disbursementDate;
    private String destinationAccountDisbursement;
    private Long approverAnalystId;
}
