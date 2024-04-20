package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.PostulacionModel;
import com.example.demo.repositories.PostulacionRepository;

@Service
public class PostulacionService {
    @Autowired
    PostulacionRepository postulacionRepository; 
    
    public ArrayList<PostulacionModel>obtenerPostulacion(){
    return (ArrayList<PostulacionModel>) postulacionRepository.findAll();
    }
    public PostulacionModel guardarPostulacion(PostulacionModel postulacion){
    return postulacionRepository.save(postulacion);
    }
}
