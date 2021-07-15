package com.example.demo.repositorioes;

import com.example.demo.models.Equipaje;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesEquipaje extends CrudRepository<Equipaje,Long>{
    
}
