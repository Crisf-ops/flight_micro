package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Origen;
import com.example.demo.services.servicesOrigen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/origen")
public class controladorOrigen {
    @Autowired
    servicesOrigen origenServices;

    @GetMapping()
    public ArrayList<Origen> obtenerOrigen() {
        return origenServices.obtOrigen();
    }

    @PostMapping()
    public Origen guardarUsuario(@RequestBody Origen cliente) {
        return this.origenServices.guardarOrigen(cliente);
    }
    
    @GetMapping(path ="/{id}")
    public Optional<Origen> obtenerOrigenoPorId(@PathVariable("id") Long  id) {
        return this.origenServices.obtenerId(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.origenServices.eliminarOrigen(id);
        if (ok) {
            return "Se elimino el origen con el id "+id;
        } else {
            return "No se pudo origen el usuario con el id"+id;
        }
    }
}
