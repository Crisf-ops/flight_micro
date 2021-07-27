package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.Cliente;
import com.example.demo.repositorioes.repositoriesCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicesCliente {
    @Autowired
    repositoriesCliente clienteRepositori;

    //Ver todos los usuarios
    public ArrayList<Cliente> obtClientes(){
        return (ArrayList<Cliente>) clienteRepositori.findAll();
    }
    //Guardar cliente
    public Cliente guardarCliente(Cliente cliente){
        return clienteRepositori.save(cliente);
    }
        
    //Buscar por Identificacion
    public List<Cliente> obtIdentificacion(String documento){
        return clienteRepositori.findByDocumento(documento);
    }
    //Actualizar
    public Cliente actualizarCliente(Cliente cliente){
        Optional<Cliente> optional = clienteRepositori.findById(cliente.getclienteId());

        Cliente existenteCliente = optional.get();
        existenteCliente.setEdad(cliente.getEdad());
        existenteCliente.setEmail(cliente.getEmail());
        existenteCliente.setNombre(cliente.getNombre());
        existenteCliente.setTelefono(cliente.getTelefono());

        return clienteRepositori.save(existenteCliente);
    }
    //Eliminar cliente
    public boolean EliminarCliente(Long id){
        try {
            clienteRepositori.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
