package com.example.demo.repositorioes;

import com.example.demo.models.Equipaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesEquipaje extends JpaRepository<Equipaje,Long>{
    
}
