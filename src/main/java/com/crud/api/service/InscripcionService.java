package com.crud.api.service;

import com.crud.api.crud.InscripcionCrudRepository;
import com.crud.api.entity.Inscripcion;
import com.crud.api.repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class InscripcionService implements InscripcionRepository {

    @Autowired
    private InscripcionCrudRepository inscripcionCrudRepository;
    /**
     * @return 
     */
    @Override
    public List<Inscripcion> getAll() {
        return (List<Inscripcion>) inscripcionCrudRepository.findAll();
    }

    /**
     * @return 
     */
    @Override
    public Optional<Inscripcion> getInscripcion(int id) {
        return (Optional<Inscripcion>) inscripcionCrudRepository.findById(id);
    }

    /**
     * @param inscripcion 
     * @return LocalDateTime
     */
    @Override
    public Inscripcion save(Inscripcion inscripcion) {
        LocalDateTime defaultDate = LocalDateTime.now();
        inscripcion.setFecha(defaultDate);
        return inscripcionCrudRepository.save(inscripcion);
    }

    /**
     * @param id 
     * @param inscripcion
     * @return
     */
    @Override
    public Inscripcion upDate(int id, Inscripcion inscripcion) {
        inscripcion.setId(id);
        return inscripcionCrudRepository.saveAndFlush(inscripcion);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public boolean delete(int id) {
        return getInscripcion(id).map(inscripcion -> {
            inscripcionCrudRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
