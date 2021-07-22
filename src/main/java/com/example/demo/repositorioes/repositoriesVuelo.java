package com.example.demo.repositorioes;

import com.example.demo.models.Vuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesVuelo extends JpaRepository<Vuelo, Long>{
    
}
