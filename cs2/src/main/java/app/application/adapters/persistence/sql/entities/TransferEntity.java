package app.application.adapters.persistence.sql.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import app.domain.models.enums.TransferStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "transfers")
@Getter
@Setter

public class TransferEntity {

    @Id
    private Long transferId;
    private String originAccount;
    private String destinationAccount;
    private BigDecimal amount;
    private LocalDateTime creationDate;
    private LocalDateTime approvalDate;
    private TransferStatus transferStatus;
    private Long creatorUserId;
    private Long approverUserId;
    private LocalDateTime expirationCheckAt;
    
}
