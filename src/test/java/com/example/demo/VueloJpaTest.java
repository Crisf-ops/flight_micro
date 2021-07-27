// package com.example.demo;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.time.LocalDate;
// import java.time.LocalTime;

// import com.example.demo.models.Cliente;
// import com.example.demo.models.Itinerario;
// import com.example.demo.models.Pasaje;
// import com.example.demo.models.Vuelo;
// import com.example.demo.repositorioes.repositoriesCliente;
// import com.example.demo.repositorioes.repositoriesItinerario;
// import com.example.demo.repositorioes.repositoriesPasaje;
// import com.example.demo.repositorioes.repositoriesVuelo;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// @DataJpaTest
// @AutoConfigureTestDatabase(replace = Replace.NONE)
// public class VueloJpaTest {
//     @Autowired
//     private repositoriesVuelo repoVuelo;
//     @Autowired
//     private repositoriesItinerario repoItinerario;
//     @Autowired
//     private repositoriesCliente repoCliente;
//     @Autowired
//     private repositoriesPasaje repoPasaje;
//     //Fechas y hora de abordage
//     LocalDate date = LocalDate.of(2021, 10, 10);
//     LocalTime time = LocalTime.of(10, 15);
//     //Fechas y horas de despegue
//     LocalDate date2 = LocalDate.of(2021, 10, 10);
//     LocalTime time2 = LocalTime.of(11, 00);

//     @Test
//     public void guardarVuelo(){
//         Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente = repoCliente.save(cliente);
//         Pasaje pasaje = new Pasaje("Vip","B45",300000,cliente);
//         pasaje = repoPasaje.save(pasaje);
//         Itinerario itinerario = new Itinerario(date, time);
//         itinerario = repoItinerario.save(itinerario);
//         Vuelo vuelo = new Vuelo(12, date2, time2, pasaje, itinerario);
//         vuelo = repoVuelo.save(vuelo);

//         repoCliente.flush();
//         repoPasaje.flush();
//         repoItinerario.flush();
//         repoVuelo.flush();

//         assertEquals(1, repoVuelo.findAll().size());
//     }
//     @Test
//     public void listarVuelo(){
//         Cliente cliente = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente = repoCliente.save(cliente);
//         Pasaje pasaje = new Pasaje("Vip","B45",300000,cliente);
//         pasaje = repoPasaje.save(pasaje);
//         Itinerario itinerario = new Itinerario(date, time);
//         itinerario = repoItinerario.save(itinerario);
//         Vuelo vuelo = new Vuelo(12, date2, time2, pasaje, itinerario);
//         vuelo = repoVuelo.save(vuelo);

//         Cliente cliente2 = new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente2 = repoCliente.save(cliente2);
//         Pasaje pasaje2 = new Pasaje("Vip","B45",300000,cliente);
//         pasaje2 = repoPasaje.save(pasaje2);
//         Itinerario itinerario2 = new Itinerario(date, time);
//         itinerario2 = repoItinerario.save(itinerario2);
//         Vuelo vuelo2 = new Vuelo(12, date2, time2, pasaje, itinerario);
//         vuelo2 = repoVuelo.save(vuelo2);

//         Cliente cliente3= new Cliente("cristian", 24, 754210, 10123457, "cris@gmail.com");
//         cliente3 = repoCliente.save(cliente3);
//         Pasaje pasaje3 = new Pasaje("Vip","B45",300000,cliente);
//         pasaje2 = repoPasaje.save(pasaje3);
//         Itinerario itinerario3 = new Itinerario(date, time);
//         itinerario3 = repoItinerario.save(itinerario3);
//         Vuelo vuelo3 = new Vuelo(12, date2, time2, pasaje, itinerario);
//         vuelo3 = repoVuelo.save(vuelo3);

//         repoCliente.flush();
//         repoPasaje.flush();
//         repoItinerario.flush();
//         repoVuelo.flush();

//         assertEquals(3, repoVuelo.findAll().size());
//     }
// }
