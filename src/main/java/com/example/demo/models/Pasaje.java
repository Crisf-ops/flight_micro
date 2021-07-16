package com.example.demo.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonCreator;


@Entity
@Table(name = "Pasajes")
public class Pasaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long pasajeId;

    @Column(length = 20, nullable = false)
    private String clase;

    @Column(length = 10, nullable = false)
    private String asiento;

    @Column(nullable = false)
    private Integer valor;

    //Foren Key -> Cliente
    @ManyToOne
    @JoinColumn(name = "clienteId")
    Cliente cliente;

    //(Bidireccional) foren Key -> Vuelo
    @OneToMany(mappedBy = "pasaje")
    private List<Vuelo> vuelo;

     //Construc
    @JsonCreator
    public Pasaje() {
    }
    public Pasaje(Cliente cliente) {
        this.cliente = cliente;
    }


    /**GET & SET */
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Long getpasajeId() {
        return pasajeId;
    }
    public void setpasajeId(Long pasajeId) {
        this.pasajeId = pasajeId;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getAsiento() {
        return asiento;
    }
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
}
