package services;

import dao.ClientDao;
import model.Clients;

import javax.persistence.Persistence;
import java.util.List;

public class ClientService{
    private ClientDao clientDao;

    public ClientService(){
        try{
            clientDao = new ClientDao(Persistence.createEntityManagerFactory("proiectdb"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addClient(Clients client){
        clientDao.create(client);
    }

    public Clients findClient(String name) throws Exception {
        List<Clients> clientList = clientDao.find(name);
        if (clientList.size() == 0)
            throw new Exception("Client not found");
        return clientList.get(0);
    }
}
