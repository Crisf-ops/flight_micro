package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Origen;
import com.example.demo.repositorioes.repositoriesOrigen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesOrigen {
    @Autowired
    repositoriesOrigen origenRepositories;

    //Ver todos los usuarios
    public ArrayList<Origen> obtOrigen(){
        return (ArrayList<Origen>) origenRepositories.findAll();
    }
    //Guardar cliente
    public Origen guardarOrigen(Origen origen){
        return origenRepositories.save(origen);
    }
    //Buscar por ID cliente
    public Optional<Origen>obtenerId(Long id){
        return origenRepositories.findById(id);
    }
    //Eliminar cliente
    public boolean eliminarOrigen(Long id){
        try {
            origenRepositories.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
