package services;

import dao.ClientDao;
import model.Clients;

import javax.persistence.Persistence;

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
}
