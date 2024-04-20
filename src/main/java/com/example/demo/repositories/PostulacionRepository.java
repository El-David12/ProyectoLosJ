package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.PostulacionModel;

@Repository
public interface PostulacionRepository extends CrudRepository<PostulacionModel, Long>{

}
