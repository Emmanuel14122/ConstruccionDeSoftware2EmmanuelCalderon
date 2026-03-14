package app.domain;

import lombok.NoArgsConstructor;
import app.domain.models.Client;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class CompanyClient extends Client {

    private String companyName;
    private String NIT;
    private String legalRepresentative;
}
