package org.example.service;

import org.example.DAO.ClientDao;
import org.example.DAO.PlanetDao;
import org.example.config.HibernateConfig;
import org.example.models.ClientModel;
import org.example.models.PlanetModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlanetCrudService {

    private final PlanetDao planetDao = new PlanetDao();

    public void savePlanet(PlanetModel planet){

        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(planet.getId());

        if (matcher.find()) {
            return;
        } else if ((planet.getName().isEmpty())||(planet.getName().length()>500)){
            return;
        }

        planet.setId(planet.getId().toUpperCase());
        planetDao.save(planet);

    }

    public PlanetModel findClientById(int id){
        return planetDao.findById(id);
    }

    public void updateClient(PlanetModel planet){
        planetDao.update(planet);
    }

    public void deleteClient(PlanetModel planet){
        planetDao.delete(planet);
    }
}
