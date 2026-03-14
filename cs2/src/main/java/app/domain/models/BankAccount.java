package app.domain.models;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

public class BankAccount {
    
    private String accountNumber;
    private String accountType;
    private String ID_Titular;
    private double CurrentBalance;
    private String currency;
    private String accountStatus;
    private String OpeningDate;

}
