package org.example.config;

import lombok.Getter;
import org.example.models.ClientModel;
import org.example.models.PlanetModel;
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
                .addAnnotatedClass(ClientModel.class)
                .addAnnotatedClass(PlanetModel.class)
                .buildSessionFactory();
    }

    public static HibernateConfig getInstance(){
        return INSTANCE;
    }

    public void close(){
        sessionFactory.close();
    }

}
