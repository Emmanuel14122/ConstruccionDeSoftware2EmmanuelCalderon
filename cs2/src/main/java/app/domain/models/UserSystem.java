package app.domain.models;

import java.sql.Date;

import app.domain.models.enums.RolUser;
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
    private Date birthDate;
    private String address;
    private RolUser systemRole;
    private UserStatus userStatus;
    private String username;
    private String password;

}
