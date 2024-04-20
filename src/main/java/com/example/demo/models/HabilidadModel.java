package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Habilidad")
public class HabilidadModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_habilidad;

    private String nombre_habilidad;
    private String descripcion_habilidad;
    private String idiomas;
}
