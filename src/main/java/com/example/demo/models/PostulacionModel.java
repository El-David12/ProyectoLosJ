package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "postulacion")
public class PostulacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_postulacion")
    private Long id_postulacion;

    @Column(name = "fecha_postulacion")
    private LocalDate fecha_postulacion;

    @Column(name = "estado")
    private String estado;
}
