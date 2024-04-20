package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PostulanteModel;
import com.example.demo.services.PostulanteService;

@RestController
@RequestMapping("/postulante")
public class PostulanteController{
    @Autowired
    PostulanteService postulanteService;

    @GetMapping()
    public ArrayList<PostulanteModel> obtenerPostulante(){
        return postulanteService.obtenerPostulante();
    }

    @PostMapping()
    public PostulanteModel guardarPostulante(@RequestBody PostulanteModel postulante){
        return this.postulanteService.guardarPostulante(postulante);
    }

    @GetMapping(path = "/{id}")
    public Optional<PostulanteModel> obtenerPostulantePorId(@PathVariable("id") Long id){
        return this.postulanteService.obtenrPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.postulanteService.eliminarPostulante(id);
        if (ok) {
            return "Se elimino el usuario con id " + id;
        } else {
            return "No pudo eliminarse e usuario con id " + id;
        }
    }
}
