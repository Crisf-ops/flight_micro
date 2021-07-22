package com.example.demo.repositorioes;

import com.example.demo.models.Itinerario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesItinerario extends JpaRepository<Itinerario,Long>{
    
}
