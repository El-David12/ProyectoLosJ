package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empresa")
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empresa;

    private String nombre_empresa; 
    private String nit;
    private String direccion_empresa;
    private String email_empresa;
    private String web_empresa;
    
}
