package app.domain.models;

import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class BankAccount {
    
    private String accountNumber;
    private String accountType;
    private String idTitular;
    private BigDecimal currentBalance;
    private String currency;
    private String accountStatus;
    private Date openingDate;

}
