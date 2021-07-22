package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Itinerario;
import com.example.demo.services.servicesItinerario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/itinerario")
public class controladorItinerario {
    @Autowired
    servicesItinerario itinerarioServices;

    @GetMapping()
    public ArrayList<Itinerario> obtItinerarios() {
        return itinerarioServices.obtItinerarios();
    }
     @PostMapping()
    public Itinerario guardarItinerario(@RequestBody Itinerario cliente) {
        return this.itinerarioServices.guardarItinerario(cliente);
    }
    @GetMapping(path ="/{id}")
    public Optional<Itinerario> obtenerItinerarioPorId(@PathVariable("id") Long  id) {
        return this.itinerarioServices.obtenerId(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.itinerarioServices.eliminarItinirario(id);
        if (ok) {
            return "Se elimino el itinerario con el id "+id;
        } else {
            return "No se pudo itinerario el usuario con el id"+id;
        }
    }
}
