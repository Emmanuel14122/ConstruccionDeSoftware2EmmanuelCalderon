package app.application.adapters.api.response;
 
import app.domain.models.enums.UserRole;
import app.domain.models.enums.UserStatus;

import java.time.LocalDateTime;
 
public record UserSystemResponse(
    Long idUser,
    String idRelated,
    String fullName,
    String idIdentification,
    String email,
    String phone,
    LocalDateTime birthDate,
    String address,
    UserRole systemRole,
    UserStatus userStatus,
    String username,
    String password
) {}