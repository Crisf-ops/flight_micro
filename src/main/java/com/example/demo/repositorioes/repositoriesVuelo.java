package com.example.demo.repositorioes;

import com.example.demo.models.Vuelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesVuelo extends CrudRepository<Vuelo, Long>{
    
}
