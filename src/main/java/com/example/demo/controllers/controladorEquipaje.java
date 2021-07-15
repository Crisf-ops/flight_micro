package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Equipaje;
import com.example.demo.services.servicesEquipaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/equipaje")
public class controladorEquipaje {
    @Autowired
    servicesEquipaje equipajeServices;

    @GetMapping()
    public ArrayList<Equipaje> obtenerEquipaje(){
        return equipajeServices.obtEquipaje();
    }

    @PostMapping()
    public Equipaje guardarEquipaje(@RequestBody Equipaje equipaje){
        return this.equipajeServices.guardarEquipaje(equipaje);
    }

    @GetMapping(path = "/{id}")
    public Optional<Equipaje> obtenerEquipajePorId(@PathVariable("id") Long id){
        return this.obtenerEquipajePorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.equipajeServices.eliminarEquipaje(id);
        if (ok) {
            return "Se elimino el equipaje con el id "+id;
        } else {
            return "No se pudo eliminar el equipaje con el id"+id;
        }
    }
}
