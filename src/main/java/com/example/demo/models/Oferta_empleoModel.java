package com.example.demo.models;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "oferta_empleo")
public class Oferta_empleoModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oferta")
    private long id_oferta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private EmpresaModel empresa;

    private String nombre_cargo;
    private String descripcion_cargo;
    private String requisitos;
    private Integer salario;
    private String jornada;
    private LocalDate fecha_publicacion;
    private String estado;

   
   
}
