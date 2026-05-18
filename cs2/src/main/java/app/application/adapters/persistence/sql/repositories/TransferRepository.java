package app.application.adapters.persistence.sql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.application.adapters.persistence.sql.entities.TransferEntity;

public interface TransferRepository extends JpaRepository<TransferEntity, Long> {
    
}
