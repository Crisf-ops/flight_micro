package com.example.demo.repositorioes;

import java.util.List;

import com.example.demo.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesCliente extends JpaRepository<Cliente,Long>{
    
    List<Cliente> findByDocumento(String documento);

}
