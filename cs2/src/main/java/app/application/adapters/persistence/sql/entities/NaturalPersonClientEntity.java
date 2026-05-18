package app.application.adapters.persistence.sql.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "natural_person_clients")
@Getter
@Setter

public class NaturalPersonClientEntity {
    
    @Id
    @Column(nullable = false, unique = true)
    private String idIdentification;
    private String fullName;
    private LocalDate birthDate;
    
}
