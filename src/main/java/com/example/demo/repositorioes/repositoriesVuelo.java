package com.example.demo.repositorioes;

import java.util.List;
// import java.util.Set;

import com.example.demo.models.Vuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesVuelo extends JpaRepository<Vuelo, Long>{
    
    List<Vuelo> findByRef(String ref);
}
