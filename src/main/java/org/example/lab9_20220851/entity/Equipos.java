package org.example.lab9_20220851.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipos")
@Getter
@Setter

public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer equipo_id;

    @Column(name = "nombre")
    private String nombre_equipo;

    @Column(name = "area")
    private String nombre_area;

}