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


public class Transfer {
    private int transferId;
    private String originAccount;
    private String destinationAccount;
    private BigDecimal amount;
    private Date creationDate;
    private Date approvalDate;
    private String transferStatus;
    private int creatorUserId;
    private int approverUserId;
}
