package app.domain.models;

import java.sql.Date;
import java.time.LocalDate;
import java.math.BigDecimal;

import app.domain.models.enums.LoanStatus;
import app.domain.models.enums.LoanType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Loan {
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
