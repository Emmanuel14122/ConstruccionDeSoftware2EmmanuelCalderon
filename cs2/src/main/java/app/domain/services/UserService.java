package app.domain.services;

import java.util.List;

import app.domain.exception.BussinesException;
import app.domain.exception.NotFoundException;
import app.domain.models.UserSystem;
import app.domain.models.enums.RolUser;
import app.domain.models.enums.UserStatus;
import app.domain.ports.UserPort;


public class UserService {

    private final UserPort userPort;

    public UserService(UserPort userPort) {
        this.userPort = userPort;
    }

    //Registra un nuevo usuario en el sistema.
    public void registerUser(UserSystem user) {
        if (userPort.existsByDocument(user.getIdIdentification())) {
            throw new BussinesException(
                "A user with identification " + user.getIdIdentification() + " already exists.");
        }
        if (userPort.existsByUsername(user.getUsername())) {
            throw new BussinesException(
                "Username '" + user.getUsername() + "' is already taken.");
        }
        if (userPort.existsByEmail(user.getEmail())) {
            throw new BussinesException(
                "Email " + user.getEmail() + " is already registered.");
        }

        user.setUserStatus(UserStatus.Active);
        userPort.save(user);
    }

    //Actualiza los datos de un usuario existente.
    public void updateUser(UserSystem user) {
        userPort.findById(user.getIdUser())
            .orElseThrow(() -> new NotFoundException(
                "User with ID " + user.getIdUser() + " not found."));

        userPort.update(user);
    }

    //Cambia el estado de un usuario (Active, Inactive, Locked).
    public void changeUserStatus(Long userId, UserStatus newStatus) {
        UserSystem user = userPort.findById(userId)
            .orElseThrow(() -> new NotFoundException(
                "User with ID " + userId + " not found."));

        user.setUserStatus(newStatus);
        userPort.update(user);
    }

    // Consultas

    //Obtiene un usuario por su identificador numérico.
    public UserSystem getUserById(Long userId) {
        return userPort.findById(userId)
            .orElseThrow(() -> new NotFoundException(
                "User with ID " + userId + " not found."));
    }

    //Obtiene un usuario por su número de identificación.
    public UserSystem getUserByDocument(String identification) {
        return userPort.findByDocument(identification)
            .orElseThrow(() -> new NotFoundException(
                "User with identification " + identification + " not found."));
    }

    //Obtiene un usuario por su username. Usado en el proceso de autenticación.
    public UserSystem getUserByUsername(String username) {
        return userPort.findByUsername(username)
            .orElseThrow(() -> new NotFoundException(
                "User with username '" + username + "' not found."));
    }

    //Retorna todos los usuarios del sistema.
    public List<UserSystem> getAllUsers() {
        return userPort.findAll();
    }

    //Retorna todos los usuarios con un rol específico.
    public List<UserSystem> getUsersByRole(RolUser role) {
        return userPort.findByRole(role);
    }

    //Retorna todos los usuarios activos con un rol específico.
    public List<UserSystem> getActiveUsersByRole(RolUser role) {
        return userPort.findByRoleAndStatus(role, UserStatus.Active);
    }


    // (Validaciones reutilizables por otros servicios)

    //Valida que un usuario exista y esté activo.
    public void validateUserIsActive(Long userId) {
        UserSystem user = userPort.findById(userId)
            .orElseThrow(() -> new NotFoundException(
                "User with ID " + userId + " not found."));

        if (user.getUserStatus() != UserStatus.Active) {
            throw new BussinesException(
                "User " + userId + " is not active. Current status: " + user.getUserStatus() + ".");
        }
    }

    //Valida que un usuario tenga el rol requerido para ejecutar una operación.
    public void validateUserHasRole(Long userId, RolUser requiredRole) {
        UserSystem user = getUserById(userId);

        if (user.getSystemRole() != requiredRole) {
            throw new BussinesException(
                "User " + userId + " does not have the required role '"
                    + requiredRole + "'. Current role: " + user.getSystemRole() + ".");
        }
    }

    //Desactiva un usuario por su número de identificación.
    public void deactivateUser(String identification) {
        userPort.findByDocument(identification)
            .orElseThrow(() -> new NotFoundException(
                "User with identification " + identification + " not found."));

        userPort.deleteByDocument(identification);
    }
}
