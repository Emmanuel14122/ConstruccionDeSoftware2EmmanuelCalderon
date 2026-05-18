package app.domain.models;

import java.time.LocalDate;
import java.math.BigDecimal;

import app.domain.models.enums.LoanStatus;
import app.domain.models.enums.LoanType;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Loan {

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
