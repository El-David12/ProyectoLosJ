package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.HabilidadModel;
import com.example.demo.repositories.HabilidadRepository;

@Service
public class HabilidadService {
    @Autowired
    HabilidadRepository habilidadRepository; 
 
    public ArrayList<HabilidadModel>obtenerHabilidad(){
    return (ArrayList<HabilidadModel>) habilidadRepository.findAll();
    }
    public HabilidadModel guardarHabilidad(HabilidadModel habilidad){
    return habilidadRepository.save(habilidad);
    }
}
