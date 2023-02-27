package com.crud.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Column(name = "id_persona")
    private String id;
    private String nombre;
    private String apellidos;

    @OneToOne(mappedBy = "persona")
    private Inscripcion inscripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
