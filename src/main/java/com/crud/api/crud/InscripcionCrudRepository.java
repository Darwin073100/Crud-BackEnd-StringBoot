package com.crud.api.crud;

import com.crud.api.entity.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionCrudRepository extends JpaRepository<Inscripcion, Integer> {
}
