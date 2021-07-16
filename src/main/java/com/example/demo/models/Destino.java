package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Destinos")
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long destinoId;

    @Column(length = 30, nullable = false)
    private String aeropuerto;

    @Column(length = 30, nullable = false)
    private String ciudad;

    //Foren Key -> Itinerario
    @ManyToOne
    @JoinColumn(name = "itinerarioId")
    Itinerario itinerario;

    //Constru
    public Destino(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    public Destino(){
    }

    /**GET & SET */
    public Long getDestinoId() {
        return destinoId;
    }
    public void setDestinoId(Long destinoId) {
        this.destinoId = destinoId;
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
    public Itinerario getItinerario() {
        return itinerario;
    }
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
}
