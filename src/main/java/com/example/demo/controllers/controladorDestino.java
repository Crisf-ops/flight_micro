package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Destino;
import com.example.demo.services.servicesDestino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/destino")
public class controladorDestino {
    @Autowired
    servicesDestino destinoServices;

    @GetMapping()
    public ArrayList<Destino> obtenerOrigen() {
        return destinoServices.obtDestino();
    }

    @PostMapping()
    public Destino guardarUsuario(@RequestBody Destino cliente) {
        return this.destinoServices.guardarDestino(cliente);
    }
    
    @GetMapping(path ="/{id}")
    public Optional<Destino> obtenerOrigenoPorId(@PathVariable("id") Long  id) {
        return this.destinoServices.obtenerId(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.destinoServices.eliminarDestino(id);
        if (ok) {
            return "Se elimino el destino con el id "+id;
        } else {
            return "No se pudo destino el usuario con el id"+id;
        }
    }
}
