package com.example.demo.repositorioes;




import com.example.demo.models.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesCliente extends CrudRepository<Cliente,Long>{
    
}
