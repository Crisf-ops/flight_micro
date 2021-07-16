package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Vuelo;
import com.example.demo.services.servicesVuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vuelo")
public class controladorVuelo {
    @Autowired
    servicesVuelo vueloServices;

    @GetMapping()
    public ArrayList<Vuelo> obtVuelos(){
        return vueloServices.obtVuelo();
    }
    
    @PostMapping()
    public Vuelo guardarVuelo(@RequestBody Vuelo vuelo){
        return this.vueloServices.guardarVuelo(vuelo);
    }

    @GetMapping(path = "/{id}")
    public Optional<Vuelo> obtenerVueloPorId(@PathVariable("id")Long id){
        return this.vueloServices.ObtenerIdVuelo(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.vueloServices.eliminarVuelo(id);
        if (ok) {
            return "Se elimino el vuelo con el id "+id;
        } else {
            return "No se pudo eliminar el vuelo con el id"+id;
        }
    }
}
