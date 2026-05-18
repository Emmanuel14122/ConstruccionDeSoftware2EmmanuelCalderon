package app.application.adapters.persistence.sql.entities;

import app.domain.models.enums.ClientStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ClientEntity {

    private String address;
    private String phoneNumber;
    private String email;
    @Enumerated(EnumType.STRING)
    private ClientStatus clientStatus;
    
}
