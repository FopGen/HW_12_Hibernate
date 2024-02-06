package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "planet")
public class PlanetModel {
    @Id
    private String id;
    private String name;
}


//@Table(neme = "planet", uniqueConstraints = {
//        @UniqueConstraint(columnNames = "name")})
