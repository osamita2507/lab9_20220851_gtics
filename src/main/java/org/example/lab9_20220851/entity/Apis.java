package org.example.lab9_20220851.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "apis")
@Getter
@Setter

public class Apis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer apis_id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "version")
    private String version;

    @Column(name = "fecha_registro")
    private LocalDate fecha;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipos equipo;

}