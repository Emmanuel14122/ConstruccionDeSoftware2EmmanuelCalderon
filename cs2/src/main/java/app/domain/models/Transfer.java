package app.domain.models;

import java.time.LocalDateTime;
import java.math.BigDecimal;

import app.domain.models.enums.TransferStatus;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor


public class Transfer {

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
