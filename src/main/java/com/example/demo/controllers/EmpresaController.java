package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.EmpresaModel;
import com.example.demo.services.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping()
    public ArrayList<EmpresaModel> getEmpresa(){
        return empresaService.getEmpresa();
    }

    @PostMapping()
    public EmpresaModel saveEmpresa(@RequestBody EmpresaModel empresa){
        return this.empresaService.saveEmpresa(empresa);
    }

    @GetMapping(path = "/{id}")
    public Optional<EmpresaModel> getEmpresaById(@PathVariable Long id){
        return this.empresaService.getById(id);
    }
}
