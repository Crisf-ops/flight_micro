package com.example.demo.models;

import java.sql.Time;
import java.util.Date;
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
    private Date fecha;

    @Column(nullable = false)
    private Time hora;



    //(Bidireccional) foren Key -> Vuelo
    @OneToMany(mappedBy = "itinerario")
    private List<Vuelo> vuelo;

    //(Bidireccional) foren Key -> Origen
    @OneToMany(mappedBy = "itinerario")
    private List<Origen> origen;
    
    //Constru
    public Itinerario() {
    }
    public Itinerario(Long itinerarioId) {
        this.itinerarioId = itinerarioId;
    }

    /**GET & SET */
    public Long getItinerarioId() {
        return itinerarioId;
    }

    public void setItinerarioId(Long itinerarioId) {
        this.itinerarioId = itinerarioId;
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

