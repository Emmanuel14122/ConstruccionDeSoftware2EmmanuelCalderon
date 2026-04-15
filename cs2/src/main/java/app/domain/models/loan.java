package app.domain.models;

import java.sql.Date;
import java.math.BigDecimal;

import app.domain.models.enums.LoanStatus;
import app.domain.models.enums.LoanType;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Loan {
    private int loanId;
    private LoanType typeLoan;
    private String clientRequestorId;
    private BigDecimal requestingAmount;
    private BigDecimal approvedAmount;
    private double interestRate;
    private int termMonths;
    private LoanStatus loanStatus;
    private Date approvalDate;
    private Date disbursementDate;
    private String destinationAccountDisbursement;

}
