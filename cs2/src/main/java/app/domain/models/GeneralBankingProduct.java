package app.domain.models;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

public class GeneralBankingProduct {
    private String Product_Code;
    private String Product_Name;
    private String Category;
    private boolean Requires_Approval;
}
