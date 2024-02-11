package org.example.config;

import org.example.models.Client;
import org.example.models.Planet;
import org.example.models.Ticket;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//@Getter
public final class HibernateConfig {
    private static final HibernateConfig INSTANCE;

    private final SessionFactory sessionFactory;

    static {
        INSTANCE = new HibernateConfig();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private HibernateConfig(){
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .addAnnotatedClass(Ticket.class)
                .buildSessionFactory();
    }

    public static HibernateConfig getInstance(){
        return INSTANCE;
    }

    public void close(){
        sessionFactory.close();
    }

}
