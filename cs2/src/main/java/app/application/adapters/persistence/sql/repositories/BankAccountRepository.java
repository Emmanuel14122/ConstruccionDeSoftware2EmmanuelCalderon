package app.application.adapters.persistence.sql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.application.adapters.persistence.sql.entities.BankAccountEntity;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, String> {
    
}
