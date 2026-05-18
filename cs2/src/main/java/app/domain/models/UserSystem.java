package app.domain.models;

import java.time.LocalDateTime;

import app.domain.models.enums.UserRole;
import app.domain.models.enums.UserStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public abstract class UserSystem {

    @Id
    private Long idUser;
    private String idRelated;
    private String fullName;
    private String idIdentification;
    private String email;
    private String phone;
    private LocalDateTime birthDate;
    private String address;
    private UserRole systemRole;
    private UserStatus userStatus;
    private String username;
    private String password;

}
