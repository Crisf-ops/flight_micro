package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Cliente;
import com.example.demo.services.servicesCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class controladorCliente{
    @Autowired
    servicesCliente clienteServices;

    //Listar
    @GetMapping()
    public ArrayList<Cliente> obtenerUsuario() {
        return clienteServices.obtClientes();
    }
    //Guardar
    @PostMapping()
    public Cliente guardarUsuario(@RequestBody Cliente cliente) {
        return this.clienteServices.guardarCliente(cliente);
    }
    //Buscar por identificacion
    @GetMapping("/query")
    public List<Cliente> obtnerDocumentoCliente(@RequestParam("documento") String documento){
        
        if(documento.equals("")){
            return this.obtenerUsuario();
        }            
        else{
            return this.clienteServices.obtIdentificacion(documento);
        }
            
    }

    /*
    @GetMapping(path ="/{id}")
    public Optional<Cliente> obtenerUsuarioPorId(@PathVariable("id") Long  id) {
        return this.clienteServices.obtenerId(id);
    }*/

    //Actualizacion
    @PutMapping(path = "actualizar/{id}")
    public Cliente actualizarCliente(@RequestBody Cliente cliente){
        return this.clienteServices.actualizarCliente(cliente);
    }

    //Eliminar
    @DeleteMapping(path = "eliminar/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.clienteServices.EliminarCliente(id);
        if (ok) {
            return "Se elimino el usuario con el id "+id;
        } else {
            return "No se pudo eliminar el usuario con el id"+id;
        }
    }
}