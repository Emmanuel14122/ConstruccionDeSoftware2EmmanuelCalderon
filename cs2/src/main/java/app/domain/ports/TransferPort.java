package app.domain.ports;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import app.domain.models.Transfer;
import app.domain.models.enums.TransferStatus;

public interface  TransferPort {

    Optional<Transfer> findById(Long transferId);

    List<Transfer> findByAccount(String accountNumber);

    List<Transfer> findByOriginAccount(String originAccount);

    List<Transfer> findByStatus(TransferStatus status);

    List<Transfer> findByCreatorUser(Long creatorUserId);

    List<Transfer> findByCompanyAndStatus(String companyNit, TransferStatus status);

    List<Transfer> findWaitingApprovalExpiredBefore(LocalDateTime now);

    List<Transfer> findAll();

    boolean existsById(Long transferId);

    void save(Transfer transfer);

    void update(Transfer transfer);
}
