package com.example.demo.models;



import java.util.List;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name = "Clientes")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long clienteId;

    @Column(length = 30, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false)
    private Integer telefono;

    @Column(nullable = false, unique = true)
    private String documento;

    @Column(length = 30, nullable = false)
    private String email;

    //(Bidireccional) foren Key -> Pasaje
    @OneToMany(mappedBy = "cliente", orphanRemoval = true)
    private List<Pasaje> pasaje;

    //(Bidireccional) foren Key -> Equipaje
    @OneToMany(mappedBy = "cliente", orphanRemoval = true)
    private List<Equipaje> equipaje;

    @OneToMany(mappedBy = "cliente")
    private List<Vuelo> vuelo;
    // @ManyToOne
    // @JoinColumn(name = "vueloId")
    // Vuelo


    //Constru
    @JsonCreator
    public Cliente() {
    }
    public Cliente(Long clienteId) {
        this.clienteId = clienteId;
    }
    
    public Cliente(String nombre, Integer edad, Integer telefono, String documento, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.documento = documento;
        this.email = email;
    }
    /**GET & SET */
    public Long getclienteId() {
        return clienteId;
    }
    public void setclienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
