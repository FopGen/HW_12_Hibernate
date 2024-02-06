package org.example;

import org.example.DAO.PlanetDao;
import org.example.models.ClientModel;
import org.example.DAO.ClientDao;
import org.example.models.PlanetModel;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;

public class Main {
    public static void main(String[] args) {

        ClientCrudService clientCrudService = new ClientCrudService();

        ClientModel newClient = new ClientModel();
        newClient.setName("Twe");
        clientCrudService.saveClient(newClient);


//        PlanetCrudService planetCrudService = new PlanetCrudService();
//
//        PlanetModel newPlanet = new PlanetModel();
//        newPlanet.setId("Sun1");
//        newPlanet.setName("SunStation1");
//
//        planetCrudService.savePlanet(newPlanet);
    }
}