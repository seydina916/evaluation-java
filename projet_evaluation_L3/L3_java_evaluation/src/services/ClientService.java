package services;

import java.util.List;

import entities.Client;
import repositories.ClientRepository;

public interface ClientService {

    Client create(Client client);
    List<Client> findAll();
    Client findById(Long id);
    Client update(Client client);
    void delete(Long id);
}
public class ClientServiceImpl implements ClientService {

    
    private ClientRepository clientRepository;

    
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client introuvable"));
    }

    public Client update(Client client) {
        return clientRepository.save(client);
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}