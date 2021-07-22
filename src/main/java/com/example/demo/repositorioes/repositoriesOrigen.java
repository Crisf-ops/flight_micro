package com.example.demo.repositorioes;

import com.example.demo.models.Origen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesOrigen extends JpaRepository<Origen,Long>{
    
}
