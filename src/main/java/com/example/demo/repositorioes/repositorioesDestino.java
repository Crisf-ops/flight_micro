package com.example.demo.repositorioes;

import com.example.demo.models.Destino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioesDestino extends JpaRepository<Destino,Long>{
    
}
