package app.domain.models;

import java.util.Date;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor


public class Transfer {
    private int Transfer_ID;
    private String Origin_Account;
    private String Destination_Account;
    private double Amount;
    private Date Creation_Date;
    private Date Approval_Date;
    private String Transfer_Status;
    private int Creator_User_ID;
    private int Approver_User_ID;
}
