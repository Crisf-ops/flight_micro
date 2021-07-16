package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Vuelo;
import com.example.demo.repositorioes.repositoriesVuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesVuelo {
    @Autowired
    repositoriesVuelo vueloRepositori;

    //Ver todos los vuelos
    public ArrayList<Vuelo> obtVuelo(){
        return(ArrayList<Vuelo>)vueloRepositori.findAll();
    }
    //Guardar Vuelo
    public Vuelo guardarVuelo(Vuelo vuelo){
        return vueloRepositori.save(vuelo);
    }
    //Buscar ID de vuelos
    public Optional<Vuelo>ObtenerIdVuelo(Long id){
        return vueloRepositori.findById(id);
    }
    //Eliminar Vuelo
    public boolean eliminarVuelo(Long id){
        try {
            vueloRepositori.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
