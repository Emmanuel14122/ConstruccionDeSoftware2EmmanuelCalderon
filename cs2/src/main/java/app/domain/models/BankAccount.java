package app.domain.models;
import java.math.BigDecimal;

import app.domain.models.enums.AccountStatus;
import app.domain.models.enums.AccountType;
import app.domain.models.enums.Currency;
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
    
    private int accountNumber;
    private AccountType accountType;
    private String idTitular;
    private BigDecimal currentBalance;
    private Currency currency;
    private AccountStatus accountStatus;
    private Date openingDate;

}
