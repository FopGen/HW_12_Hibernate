package org.example.service;

import org.example.DAO.TicketDao;
import org.example.models.Client;
import org.example.models.Planet;
import org.example.models.Ticket;

public class TicketCrudService {

    private final TicketDao ticketDao = new TicketDao();
    private Planet validatedPlanetTo;
    private Planet validatedPlanetFrom;

    public void saveTicket(Ticket ticket){
        if (validateClient(ticket.getClient())&&validatePlanet(ticket.getToPlanetId(), ticket.getFromPlanetId())){
            ticket.setToPlanetId(validatedPlanetTo);
            ticket.setFromPlanetId(validatedPlanetFrom);
            ticketDao.save(ticket);
        }
    }

    public Ticket findTicketById(int id){
        return ticketDao.findById(id);
    }

    public void updateTicket(Ticket ticket){
        if (validateClient(ticket.getClient())&&validatePlanet(ticket.getToPlanetId(), ticket.getFromPlanetId())){
            ticketDao.update(ticket);
        }
    }

    public void deleteTicket(Ticket ticket){
        if (validateClient(ticket.getClient())&&validatePlanet(ticket.getToPlanetId(), ticket.getFromPlanetId())){
            ticketDao.delete(ticket);
        }
    }

    private boolean validateClient(Client client) {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client temporaryClient = clientCrudService.findClientById(client.getId());
        if(temporaryClient!=null){
            return true;
        }
        System.out.println("INCORECT CLIENT ID!!!");
        return false;
    }
    private boolean validatePlanet(Planet toPlanetId, Planet fromPlanetId) {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        validatedPlanetTo = planetCrudService.findPlanetById(toPlanetId.getId());
        validatedPlanetFrom = planetCrudService.findPlanetById(fromPlanetId.getId());

        if((validatedPlanetTo !=null)&&(validatedPlanetFrom !=null)){
            return true;
        }
        System.out.println("INCORECT PLANET ID!!!");
        return false;
    }

}
