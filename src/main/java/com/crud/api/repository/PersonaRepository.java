package com.crud.api.repository;

import com.crud.api.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository {
    List<Persona> getAll();
    Optional<Persona> getProduct(String idPersona);
    Persona save(Persona persona);
    Persona upDate(Persona persona, String idPersona);
    void delete(String idPersona);
}
