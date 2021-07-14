package com.example.demo.models;



import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idcliente;

    private String nombre;
    private Integer edad;
    private Integer telefono;
    private Integer documento;
    private String email;
    private Integer idequipaje;

    public Long getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
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
    public Integer getIdequipaje() {
        return idequipaje;
    }
    public void setIdequipaje(Integer idequipaje) {
        this.idequipaje = idequipaje;
    }

}
