package org.example.DAO;

import org.example.config.HibernateConfig;
import org.example.models.ClientModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {

    private SessionFactory sessionFactory = HibernateConfig.getInstance().getSessionFactory();

    public void save(ClientModel client){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(client);
            tx.commit();
        }
    }

    public ClientModel findById(int id){
        try(Session session = sessionFactory.openSession()){
            return session.get(ClientModel.class, id);
        }
    }

    public void update(ClientModel client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(client);
            tx.commit();
        }
    }

    public void delete(ClientModel client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(client);
            tx.commit();
        }
    }
}
