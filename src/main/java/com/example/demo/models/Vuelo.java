package com.example.demo.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
@Table(name = "Vuelos")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long vueloId;

    @Column(nullable = false)
    private Integer capacidad;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;

    //Foren Key -> Vuelo
    @ManyToOne
    @JoinColumn(name = "pasajeId")
    Pasaje pasaje;

    //Foren Key -> Itinerario
    @ManyToOne
    @JoinColumn(name = "itinerarioId")
    Itinerario itinerario;


    //Constru
    public Vuelo() {
    }
    public Vuelo(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
    public Vuelo(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    
    public Vuelo(Integer capacidad, LocalDate fecha, LocalTime hora, Pasaje pasaje, Itinerario itinerario) {
        this.capacidad = capacidad;
        this.fecha = fecha;
        this.hora = hora;
        this.pasaje = pasaje;
        this.itinerario = itinerario;
    }
    /**GET & SET */
    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    public Pasaje getPasaje() {
        return pasaje;
    }
    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
    public Long getVueloId() {
        return vueloId;
    }
    public void setVueloId(Long vueloId) {
        this.vueloId = vueloId;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
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
