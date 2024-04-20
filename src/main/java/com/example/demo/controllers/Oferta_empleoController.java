package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Oferta_empleoModel;
import com.example.demo.services.Oferta_empleoService;

@RestController
@RequestMapping("/oferta_empleo")
public class Oferta_empleoController {
    @Autowired
    Oferta_empleoService oferta_empleoService;

    @GetMapping()
    public ArrayList<Oferta_empleoModel> obtenerOferta_empleo(){
    return oferta_empleoService.obtenerOferta_empleo();
    }
    
    @PostMapping()
    public Oferta_empleoModel guardarOferta_empleo(@RequestBody Oferta_empleoModel oferta_empleo){
    return this.oferta_empleoService.guardarOferta_empleo(oferta_empleo);
    }
}
