package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Oferta_empleoModel;
import com.example.demo.repositories.Oferta_empleoRepository;

@Service
public class Oferta_empleoService {
    @Autowired
    Oferta_empleoRepository oferta_empleoRepository; 
        
    public ArrayList<Oferta_empleoModel>obtenerOferta_empleo(){
    return (ArrayList<Oferta_empleoModel>) oferta_empleoRepository.findAll();
    }
    public Oferta_empleoModel guardarOferta_empleo(Oferta_empleoModel oferta_empleo){
    return oferta_empleoRepository.save(oferta_empleo);
    }
}
