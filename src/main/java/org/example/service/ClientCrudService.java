package org.example.service;

import org.example.DAO.ClientDao;
import org.example.models.Client;

public class ClientCrudService {

    private final ClientDao clientDao = new ClientDao();

    public void saveClient(Client client){
        if (validateName(client)){
            clientDao.save(client);
        }
    }


    public Client findClientById(int id){
        return clientDao.findById(id);
    }

    public void updateClient(Client client){
        if (validateName(client)) {
            clientDao.update(client);
        }
    }

    public void deleteClient(Client client){
        if (validateName(client)) {
            clientDao.delete(client);
        }
    }
    private static boolean validateName(Client client) {
        if ((client.getName().length()<3)||(client.getName().length()>200)){
            System.out.println("the field 'NAME' incorrect!");
            return false;
        }
        return true;
    }
}
