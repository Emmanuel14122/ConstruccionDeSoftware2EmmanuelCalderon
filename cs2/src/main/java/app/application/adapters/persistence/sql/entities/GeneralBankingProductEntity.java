package app.application.adapters.persistence.sql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "general_banking_products")
@Getter
@Setter

public class GeneralBankingProductEntity {

    @Id
    private String productCode;
    private String productName;
    private String category;
    private boolean requiresApproval;
    
}
