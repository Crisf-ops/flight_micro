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

    @Column(nullable = false)
    private Integer documento;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(nullable = false)
    private Integer equipajeId;

   //(Bidireccional) foren Key -> Pasaje
    @OneToMany(mappedBy = "cliente")
    private List<Pasaje> pasaje;

    @JsonCreator
    public Cliente() {
    }
    public Cliente(Long clienteId) {
        this.clienteId = clienteId;
    }

    /**GET & SET */
    public Integer getEquipajeId() {
        return equipajeId;
    }
    public void setEquipajeId(Integer equipajeId) {
        this.equipajeId = equipajeId;
    }
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
    public Integer getDocumento() {
        return documento;
    }
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
