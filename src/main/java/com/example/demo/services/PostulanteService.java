package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.PostulanteModel;
import com.example.demo.repositories.PostulanteRepository;

@Service
public class PostulanteService {
    @Autowired
    PostulanteRepository postulanteRepository; 
    
    public ArrayList<PostulanteModel>obtenerPostulante(){
        return (ArrayList<PostulanteModel>) postulanteRepository.findAll();
    }

    public PostulanteModel guardarPostulante(PostulanteModel postulante){
        return postulanteRepository.save(postulante);
    }

    public Optional <PostulanteModel> obtenrPorId(Long id){
        return postulanteRepository.findById(id);
    }

    public boolean eliminarPostulante(Long id){
        try {
            postulanteRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
