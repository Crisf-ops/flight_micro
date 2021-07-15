package com.example.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "Equipajes")
public class Equipaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long equipajeId;

    @Column(nullable = true)
    private Integer peso;

    //Foren Key -> Cliente
    @ManyToOne
    @JoinColumn(name = "clienteId")
    Cliente cliente;
    
    //Construc
    public Equipaje() {
    }    
    public Equipaje(Cliente cliente) {
        this.cliente = cliente;
    }



    /**GET & SET */
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Long getEquipajeId() {
        return equipajeId;
    }

    public void setEquipajeId(Long equipajeId) {
        this.equipajeId = equipajeId;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
