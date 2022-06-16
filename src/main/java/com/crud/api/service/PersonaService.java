package com.crud.api.service;

import com.crud.api.crud.PersonaCrudRepository;
import com.crud.api.entity.Persona;
import com.crud.api.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
        return personaCrudRepository.findById(idPersona);
    }

    /**
     * @param persona 
     * @return
     */
    @Override
    public Persona save(Persona persona) {
        return personaCrudRepository.save(persona);
    }

    /**
     * @param persona 
     * @param idPersona
     * @return
     */
    @Override
    public Persona upDate(Persona persona, String idPersona) {
        persona.setId(idPersona);
        return personaCrudRepository.saveAndFlush(persona);
    }

    /**
     * @param idPersona 
     */
    @Override
    public boolean delete(String idPersona) {
        return getProduct(idPersona).map(persona -> {
            personaCrudRepository.deleteById(idPersona);
            return true;
        }).orElse(false);
    }
}
