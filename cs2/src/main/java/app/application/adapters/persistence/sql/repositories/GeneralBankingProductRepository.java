package app.application.adapters.persistence.sql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.application.adapters.persistence.sql.entities.GeneralBankingProductEntity;

public interface GeneralBankingProductRepository extends JpaRepository<GeneralBankingProductEntity, String> {
    
}
