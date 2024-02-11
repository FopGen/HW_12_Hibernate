package org.example.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    private String id;
    private String name;

//    @OneToMany(mappedBy = "Planet")
//    private Set<Ticket> tickets;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

