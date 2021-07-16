package com.example.demo.repositorioes;

import com.example.demo.models.Itinerario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesItinerario extends CrudRepository<Itinerario,Long>{
    
}
