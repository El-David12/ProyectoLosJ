package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "postulante")
public class PostulanteModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_postulante")
    private Long id_postulante;
    
    private String nombre_postulante;
    private String apellido_postulante;
    private String email_postulante;                            
    
}