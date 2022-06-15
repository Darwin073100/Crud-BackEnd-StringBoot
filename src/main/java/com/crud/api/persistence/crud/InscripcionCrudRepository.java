package com.crud.api.persistence.crud;

import com.crud.api.persistence.entity.Inscripcion;
import org.springframework.data.repository.CrudRepository;

public interface InscripcionCrudRepository extends CrudRepository<Inscripcion, Integer> {
}
