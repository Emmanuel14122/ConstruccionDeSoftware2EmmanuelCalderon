package app.application.adapters.persistence.sql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.application.adapters.persistence.sql.entities.UserSystemEntity;

public interface UserSystemRepository extends JpaRepository<UserSystemEntity, Long>{
    
}
