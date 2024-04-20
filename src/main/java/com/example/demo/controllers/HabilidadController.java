package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.HabilidadModel;
import com.example.demo.services.HabilidadService;

@RestController
@RequestMapping("/habilidad")
public class HabilidadController {

    @Autowired
    HabilidadService habilidadService;

    @GetMapping()
    public ArrayList<HabilidadModel> obtenerHabilidad(){
        return habilidadService.obtenerHabilidad();
    }

    @PostMapping()
    public HabilidadModel guardarHabilidad(@RequestBody HabilidadModel habilidad){
        return this.habilidadService.guardarHabilidad(habilidad);
    }
}
