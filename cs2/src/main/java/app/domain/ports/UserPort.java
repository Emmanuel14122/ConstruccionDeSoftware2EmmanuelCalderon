package app.domain.ports;

import java.util.List;

import app.domain.models.UserSystem;

public interface UserPort {
    public boolean existisByDocument(String identification);
    public boolean existisByUserName(String userName);
    public boolean existsByEmail(String email);

    public UserSystem findByDocument(String identification);
    public UserSystem findByUserName(String userName);
    public List<UserSystem> findAll();


    public void save(UserSystem user);
    public void update(UserSystem user);
    public void deleteByDocument(String identification);
}
