package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.EmpresaModel;
import com.example.demo.repositories.EmpresaRepository;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository; 
    
    public ArrayList<EmpresaModel>getEmpresa(){
    return (ArrayList<EmpresaModel>) empresaRepository.findAll();
    }

    public EmpresaModel saveEmpresa(EmpresaModel empresa){
    return empresaRepository.save(empresa);
    }

    public Optional<EmpresaModel> getById(Long id){
        return empresaRepository.findById(id);
    }

    
}
