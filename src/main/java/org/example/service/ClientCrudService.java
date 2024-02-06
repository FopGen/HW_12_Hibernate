package org.example.service;

import org.example.DAO.ClientDao;
import org.example.config.HibernateConfig;
import org.example.models.ClientModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientCrudService {

    private final ClientDao clientDao = new ClientDao();

    public void saveClient(ClientModel client){
        if ((client.getName().length()<3)||(client.getName().length()>200)){
            return;
        }
        clientDao.save(client);
    }

    public ClientModel findClientById(int id){
        return clientDao.findById(id);
    }

    public void updateClient(ClientModel client){
        clientDao.update(client);
    }

    public void deleteClient(ClientModel client){
        clientDao.delete(client);
    }
}
