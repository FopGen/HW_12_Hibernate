package org.example.service;

import org.example.config.HibernateConfig;
import org.example.models.PlanetModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetCrudService {
    private SessionFactory sessionFactory = HibernateConfig.getInstance().getSessionFactory();

    public void save(PlanetModel planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(planet);
            tx.commit();
        }
    }

    public PlanetModel findById(int id){
        try(Session session = sessionFactory.openSession()){
            return session.get(PlanetModel.class, id);
        }
    }

    public void update(PlanetModel planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(planet);
            tx.commit();
        }
    }

    public void delete(PlanetModel planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(planet);
            tx.commit();
        }
    }

}
