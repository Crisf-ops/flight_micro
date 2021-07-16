package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.repositorioes.repositoriesItinerario;
import com.example.demo.models.Itinerario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;

@Service
public class servicesItinerario {
    @Autowired
    repositoriesItinerario itinerarioRepositori;

        //Ver todos los itinerario
        public ArrayList<Itinerario> obtItinerarios(){
            return (ArrayList<Itinerario>) itinerarioRepositori.findAll();
        }
        //Guardar itinerario
        public Itinerario guardarItinerario(Itinerario itinerario){
            return itinerarioRepositori.save(itinerario);
        }
        //Buscar por ID itinerario
        public Optional<Itinerario>obtenerId(Long id){
            return itinerarioRepositori.findById(id);
        }
        //Eliminar itinerario
        public boolean eliminarItinirario(Long id){
            try {
                itinerarioRepositori.deleteById(id);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
}
