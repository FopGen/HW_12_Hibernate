package org.example.service;

import org.example.DAO.PlanetDao;
import org.example.models.PlanetModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlanetCrudService {

    private final PlanetDao planetDao = new PlanetDao();

    public void savePlanet(PlanetModel planet){

        if (validateId(planet)){
            planet.setId(planet.getId().toUpperCase());
            planetDao.save(planet);
        }
    }

    public PlanetModel findClientById(int id){
        return planetDao.findById(id);
    }

    public void updateClient(PlanetModel planet){
        if(validateId(planet)){
            planet.setId(planet.getId().toUpperCase());
            planetDao.update(planet);
        }
    }

    public void deleteClient(PlanetModel planet){
        if(validateId(planet)){
            planet.setId(planet.getId().toUpperCase());
            planetDao.delete(planet);
        }
    }

    private Boolean validateId(PlanetModel planet){
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(planet.getId());
        if (matcher.find()) {
            System.out.println("the field 'ID' have incorrect symbol");
            return false;
        } else if ((planet.getName().isEmpty())||(planet.getName().length()>500)){
            System.out.println("the field 'ID' incorrect");
            return false;
        }
    return true;
    }
}
