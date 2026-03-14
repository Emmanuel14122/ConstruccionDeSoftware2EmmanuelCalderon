package app.domain.models;

import java.util.Date;  
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

public class loan {
    private int loan_id;
    private String Type_loan;
    private String Client_Requestor_ID;
    private double Requesting_Amount;
    private double Approved_Amount;
    private double Interest_Rate;
    private int Term_Months;
    private String Loan_Status;
    private Date Approval_Date;
    private Date Disbursement_Date;
    private String Destination_Account_Disbursement;

}
