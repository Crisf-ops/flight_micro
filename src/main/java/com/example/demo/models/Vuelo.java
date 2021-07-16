package com.example.demo.models;

import java.sql.Date;
import java.sql.Time;

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
    private Date fecha;

    @Column(nullable = false)
    private Time hora;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
}
