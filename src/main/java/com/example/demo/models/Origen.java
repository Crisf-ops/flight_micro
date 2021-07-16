package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Origenes")
public class Origen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long origenId;

    @Column(length = 30, nullable = false)
    private String aeropuerto;

    @Column(length = 30, nullable = false)
    private String ciudad;

    //Foren Key -> Itinerario
    @ManyToOne
    @JoinColumn(name = "itinerarioId")
    Itinerario itinerario;
    
    //Constru
    public Origen(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    public Origen() {
    }


    /**GET & SET */
    public Long getOrigenId() {
        return origenId;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    
    public void setOrigenId(Long origenId) {
        this.origenId = origenId;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
