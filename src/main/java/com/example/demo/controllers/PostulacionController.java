package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PostulacionModel;
import com.example.demo.services.PostulacionService;

@RestController
@RequestMapping("/postulacion")
public class PostulacionController {
    @Autowired
    PostulacionService postulacionService;

    @GetMapping()
    public ArrayList<PostulacionModel> obtenerPostulacion(){
        return postulacionService.obtenerPostulacion();
    }
    @PostMapping()
    public PostulacionModel guardarPostulacion(@RequestBody PostulacionModel postulacion){
        return this.postulacionService.guardarPostulacion(postulacion);
    }
}
