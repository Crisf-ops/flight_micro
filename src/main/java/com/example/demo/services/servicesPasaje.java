package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Pasaje;
import com.example.demo.repositorioes.repositoriesPasaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesPasaje {
    @Autowired
    repositoriesPasaje pasajeRespositori;

    //Ver todos los pasajes
    public ArrayList<Pasaje> obtPasaje(){
        return(ArrayList<Pasaje>)pasajeRespositori.findAll();
    }
    //Guardar Pasaje
    public Pasaje guardarPasaje(Pasaje pasaje){
        return pasajeRespositori.save(pasaje); 
    }
    //Buscar ID de pasaje
    public Optional<Pasaje>ObtenerIdPasaje(Long id){
        return pasajeRespositori.findById(id);
    }
    //Eliminar pasaje
    public boolean eliminarPasaje(Long id){
        try {
            pasajeRespositori.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
