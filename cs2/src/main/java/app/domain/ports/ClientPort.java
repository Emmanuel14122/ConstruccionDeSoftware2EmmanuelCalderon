package app.domain.ports;

import java.util.List;

import app.domain.models.Client;

public interface ClientPort {
    //find
    public Client findByDocument(String identification);
    public List<Client> findAll();
    //exists
    public boolean existisByDocument(String identification);
    //operation
    public void save(Client client);
    public void update(Client client);
    public void deleteByDocument(String identification);
}
