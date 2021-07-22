package com.example.demo.repositorioes;

import com.example.demo.models.Pasaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  repositoriesPasaje extends JpaRepository<Pasaje, Long >{
    
}
