package app.domain.models;

import java.sql.Date;
import java.math.BigDecimal;

import app.domain.models.enums.TransferStatus;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor


public class Transfer {
    private int transferId;
    private BankAccount originAccount;
    private BankAccount destinationAccount;
    private BigDecimal amount;
    private Date creationDate;
    private Date approvalDate;
    private TransferStatus transferStatus;
    private int creatorUserId;
    private int approverUserId;
}
