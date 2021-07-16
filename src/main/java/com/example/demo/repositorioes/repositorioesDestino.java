package com.example.demo.repositorioes;

import com.example.demo.models.Destino;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioesDestino extends CrudRepository<Destino,Long>{
    
}
