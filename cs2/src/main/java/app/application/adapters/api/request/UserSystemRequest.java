package app.application.adapters.api.request;
 
import app.domain.models.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import app.domain.models.enums.UserStatus;
 
@Getter
@Setter
public class UserSystemRequest {
 
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
