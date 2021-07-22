package com.example.demo.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Itinerarios")
public class Itinerario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long itinerarioId;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;



    //(Bidireccional) foren Key -> Vuelo
    @OneToMany(mappedBy = "itinerario")
    private List<Vuelo> vuelo;

    //(Bidireccional) foren Key -> Origen
    @OneToMany(mappedBy = "itinerario")
    private List<Origen> origen;

    //(Bidireccional) foren Key -> Destino
    @OneToMany(mappedBy = "itinerario")
    private List<Destino> destino;
    
    //Constru
    public Itinerario() {
    }
    public Itinerario(Long itinerarioId) {
        this.itinerarioId = itinerarioId;
    }
    
    public Itinerario(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    /**GET & SET */
    public Long getItinerarioId() {
        return itinerarioId;
    }

    public void setItinerarioId(Long itinerarioId) {
        this.itinerarioId = itinerarioId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
}

