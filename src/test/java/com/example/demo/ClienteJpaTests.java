package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.models.Cliente;
import com.example.demo.models.Pasaje;
import com.example.demo.repositorioes.repositoriesCliente;

import com.example.demo.repositorioes.repositoriesPasaje;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ClienteJpaTests {
    @Autowired
    private repositoriesCliente repo;
    @Autowired
    repositoriesPasaje repoPasaje;

    @Test
    public void guardarCliente(){

        Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");

        repo.save(cliente);

        repo.flush();

        assertEquals(1, repo.findAll().size());
    }

    @Test
    public void eliminarCliente() {
        Cliente cliente = new Cliente("cristian", 25, 1201424, 4120145, "cris@gmail.com");

        repo.save(cliente);

        repo.flush();

        repo.delete(cliente);

        assertEquals(0, repo.findAll().size());
    }

    @Test
    public void validarClienteIdentificacion() {
        Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
        Cliente retorno = repo.save(cliente);
        repo.save(cliente);
        
        assertEquals(retorno.getDocumento(), cliente.getDocumento());
    }

    @Test
    public void listarClientes() {
        Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
        Cliente cliente2 = new Cliente("elibys", 30, 75421, 454120, "elio@gmail.com");
        Cliente cliente3 = new Cliente("felipe", 14, 302145, 2014537, "pipe@gmail.com");
        Cliente cliente4 = new Cliente("andres", 30, 562314, 78945214, "an@gmail.com");

        repo.save(cliente);
        repo.save(cliente2);
        repo.save(cliente3);
        repo.save(cliente4);

        repo.flush();

        assertEquals(4, repo.findAll().size());
    }

    @Test
    public void forenKeyPasaje() {
        Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
        cliente = repo.save(cliente);
        Pasaje pasaje = new Pasaje("Vip","B45",300000,cliente);
        pasaje = repoPasaje.save(pasaje);

        assertEquals(cliente.getclienteId(),pasaje.getpasajeId());
        assertEquals(1, repo.findAll().size());
        
    }
}
