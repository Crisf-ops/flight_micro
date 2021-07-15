package com.example.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "Pasajes")
public class Pasaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idpasaje;

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

     //Construc
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
    public Long getIdpasaje() {
        return idpasaje;
    }
    public void setIdpasaje(Long idpasaje) {
        this.idpasaje = idpasaje;
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
