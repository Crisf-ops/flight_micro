// package com.example.demo;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import com.example.demo.models.Cliente;
// import com.example.demo.models.Pasaje;
// import com.example.demo.repositorioes.repositoriesCliente;
// import com.example.demo.repositorioes.repositoriesPasaje;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// @DataJpaTest
// @AutoConfigureTestDatabase(replace = Replace.NONE)
// public class PasajeJpaTest {
//     @Autowired
//     private repositoriesCliente repoCliente;
//     @Autowired
//     private repositoriesPasaje repoPasaje;

//     @Test
//     public void guardarPasaje(){

//         Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente = repoCliente.save(cliente);
//         Pasaje pasaje = new Pasaje("Vip","B45",300000,cliente);
//         pasaje = repoPasaje.save(pasaje);

//         assertEquals(1, repoPasaje.findAll().size());
        
//     }
//     @Test
//     public void eliminarPasaje(){

//         Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente = repoCliente.save(cliente);
//         Pasaje pasaje = new Pasaje("Vip","B45",300000,cliente);
//         pasaje = repoPasaje.save(pasaje);
        
//         repoCliente.flush();
//         repoPasaje.flush();
//         repoPasaje.delete(pasaje);

//         assertEquals(0, repoPasaje.findAll().size());
//     }
//     @Test
//     public void listatarPasaje(){

//         Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente = repoCliente.save(cliente);
//         Cliente cliente2 = new Cliente("felipe", 24, 754210, 10123457, "cris@gmail.com");
//         cliente2 = repoCliente.save(cliente2);
//         Pasaje pasaje = new Pasaje("Vip","B45",300000,cliente);
//         pasaje = repoPasaje.save(pasaje);
//         Pasaje pasaje2 = new Pasaje("Vip","B45",300000,cliente2);
//         pasaje2 = repoPasaje.save(pasaje2);

//         repoCliente.flush();;
//         repoPasaje.flush();

//         assertEquals(2, repoPasaje.findAll().size());
//     }
// }
