package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Destino;
import com.example.demo.repositorioes.repositorioesDestino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesDestino {
    @Autowired
    repositorioesDestino destinoRespories;

    //Ver todos los usuarios
    public ArrayList<Destino> obtDestino(){
        return (ArrayList<Destino>) destinoRespories.findAll();
    }
    //Guardar cliente
    public Destino guardarDestino(Destino destino){
        return destinoRespories.save(destino);
    }
    //Buscar por ID cliente
    public Optional<Destino>obtenerId(Long id){
        return destinoRespories.findById(id);
    }
    //Eliminar cliente
    public boolean eliminarDestino(Long id){
        try {
            destinoRespories.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
