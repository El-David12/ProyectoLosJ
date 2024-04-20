package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Oferta_empleoModel;

@Repository
public interface Oferta_empleoRepository extends CrudRepository<Oferta_empleoModel, Long> {

}
