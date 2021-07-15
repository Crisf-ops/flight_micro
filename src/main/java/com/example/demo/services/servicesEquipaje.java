package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Equipaje;
import com.example.demo.repositorioes.repositoriesEquipaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesEquipaje {
    @Autowired
    repositoriesEquipaje equioajeRepositori;

    //Ver todos los equipajes
    public ArrayList<Equipaje> obtEquipaje(){
        return(ArrayList<Equipaje>) equioajeRepositori.findAll();
    }
    //Guardar Equipaje
    public Equipaje guardarEquipaje(Equipaje equipaje){
        return equioajeRepositori.save(equipaje);
    }
    //Buscar por ID equipaje
    public Optional<Equipaje>obtenerId(Long id){
        return equioajeRepositori.findById(id);
    } 
    //Eliminar equipaje
    public boolean eliminarEquipaje(Long id){
        try {
            equioajeRepositori.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
