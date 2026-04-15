package app.domain.ports;

import java.util.List;

import app.domain.models.Client;
import app.domain.models.Transfer;

public interface  TransferPort {
    public boolean existisById(String id);
    public Transfer findById(String Id);
    public List<Transfer> findByCustomer(Client client);
    public void save(Transfer transfere);
    public void update(Transfer transfer);
}
