package app.domain.models;

import java.sql.Date;

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
    private String typeLoan;
    private String clientRequestor_id;
    private BigDecimal requestingAmount;
    private BigDecimal approvedAmount;
    private double interestRate;
    private int termMonths;
    private String loanStatus;
    private Date approvalDate;
    private Date disbursementDate;
    private String destinationAccountDisbursement;

}
