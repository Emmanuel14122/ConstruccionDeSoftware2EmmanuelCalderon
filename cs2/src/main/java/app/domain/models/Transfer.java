package app.domain.models;

import java.time.LocalDateTime;
import java.math.BigDecimal;

import app.domain.models.enums.TransferStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor


public class Transfer {

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
