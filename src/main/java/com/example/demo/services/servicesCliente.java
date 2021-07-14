package com.example.demo.services;

import java.util.ArrayList;
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
    //Buscar por ID cliente
    public Optional<Cliente>obtenerId(Long id){
        return clienteRepositori.findById(id);
    }
    //Eliminar
    public boolean EliminarCliente(Long id){
        try {
            clienteRepositori.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
