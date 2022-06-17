package com.crud.api.repository;

import com.crud.api.entity.Inscripcion;

import java.util.List;
import java.util.Optional;

public interface InscripcionRepository {

    List<Inscripcion> getAll();

    Optional<Inscripcion> getInscripcion(int id);

    Inscripcion save(Inscripcion inscripcion);

    Inscripcion upDate(int id, Inscripcion inscripcion);

    boolean delete(int id);
}
