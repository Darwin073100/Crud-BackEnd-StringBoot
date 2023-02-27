package com.crud.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Integer id;
    private String nombre;
    private Integer creditos;

    @OneToOne(mappedBy = "carrera")
    private Inscripcion inscripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
