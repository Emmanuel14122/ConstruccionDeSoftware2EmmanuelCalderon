package app.domain.ports;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import app.domain.models.OperationsLog;

public interface OperationsLogPort {

    Optional<OperationsLog> findById(String logbookId);

    List<OperationsLog> findByAffectedProduct(String affectedProductId);

    List<OperationsLog> findByUser(Long userId);

    List<OperationsLog> findByOperationType(String operationType);

    List<OperationsLog> findByDateRange(LocalDateTime from, LocalDateTime to);

    List<OperationsLog> findAll();

    boolean existsById(String logbookId);

    void save(OperationsLog operationsLog);
}
