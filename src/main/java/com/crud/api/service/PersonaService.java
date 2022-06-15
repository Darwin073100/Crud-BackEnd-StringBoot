package com.crud.api.service;

import com.crud.api.crud.PersonaCrudRepository;
import com.crud.api.entity.Persona;
import com.crud.api.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonaService implements PersonaRepository {

    @Autowired
    private PersonaCrudRepository personaCrudRepository;
    /**
     * @return 
     */
    @Override
    public List<Persona> getAll() {
        return (List<Persona>)personaCrudRepository.findAll();
    }

    /**
     * @param idPersona 
     * @return
     */
    @Override
    public Optional<Persona> getProduct(String idPersona) {
        return Optional.empty();
    }

    /**
     * @param persona 
     * @return
     */
    @Override
    public Persona save(Persona persona) {
        return null;
    }

    /**
     * @param persona 
     * @param idPersona
     * @return
     */
    @Override
    public Persona upDate(Persona persona, String idPersona) {
        return null;
    }

    /**
     * @param idPersona 
     */
    @Override
    public void delete(String idPersona) {

    }
}
