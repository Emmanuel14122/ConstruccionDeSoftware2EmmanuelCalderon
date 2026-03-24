package app.domain.models;

import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class GeneralBankingProduct {
    private String productCode;
    private String productName;
    private String category;
    private boolean requiresApproval;
}
