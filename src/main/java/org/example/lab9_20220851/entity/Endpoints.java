package org.example.lab9_20220851.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "endpoints")
@Getter
@Setter

public class Endpoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer endpoints_id;

    @Column(name = "ruta")
    private String ruta;

    @Column(name = "metodo_http")
    private String metodo_http;

    @Column(name = "descripcion")
    private Integer descripcion;

    @ManyToOne
    @JoinColumn(name = "api_id")
    private Apis apis;

}