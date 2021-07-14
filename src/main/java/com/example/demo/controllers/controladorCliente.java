package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.Cliente;
import com.example.demo.services.servicesCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/usuario")
public class controladorCliente{
    @Autowired
    servicesCliente clienteServices;

    @GetMapping()
    public ArrayList<Cliente> obtenerUsuario() {
        return clienteServices.obtClientes();
    }

    @PostMapping()
    public Cliente guardarUsuario(@RequestBody Cliente cliente) {
        return this.clienteServices.guardarCliente(cliente);
    }
    
    @GetMapping(path ="/{id}")
    public Optional<Cliente> obtenerUsuarioPorId(@PathVariable("id") Long  id) {
        return this.clienteServices.obtenerId(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.clienteServices.EliminarCliente(id);
        if (ok) {
            return "Se elimino el usuario con el id "+id;
        } else {
            return "No se pudo eliminar el usuario con el id"+id;
        }
    }
}