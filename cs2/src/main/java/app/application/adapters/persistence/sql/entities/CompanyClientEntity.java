package app.application.adapters.persistence.sql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "company_clients")
@Getter
@Setter
public class CompanyClientEntity {

    @Id
    private String nit;
    private String companyName;
    private String legalRepresentativeId;

}
