package org.example;


import org.example.config.HibernateConfig;
import org.example.models.ClientModel;
import org.example.service.ClientCrudService;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        ClientCrudService clientService = new ClientCrudService();

        ClientModel client = new ClientModel();
        client.setName("Twelve");
        clientService.save(client);

        ClientModel clientModel = clientService.findById(5);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Found Client: " + clientModel.getName());






//            hibernateConfig.close();


    }
}