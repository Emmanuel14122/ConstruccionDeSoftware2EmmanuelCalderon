package app.application.adapters.persistence.sql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.application.adapters.persistence.sql.entities.LoanEntity;

public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
    
}
