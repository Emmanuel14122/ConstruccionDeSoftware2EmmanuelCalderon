package app.domain.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public abstract class UserSystem {

    private int idUser;
    private String idRelated;
    private String fullName;
    private String idIdentification;
    private String email;
    private String phone;
    private Date birthDate;
    private String address;
    private String systemRole;
    private String userStatus;

}
