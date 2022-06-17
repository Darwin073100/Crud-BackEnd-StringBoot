package com.crud.api.repository;

import com.crud.api.entity.Carrera;

import java.util.List;
import java.util.Optional;

public interface CarreraRepository {
    List<Carrera> getAll();
    Optional<Carrera> getCarrera(int idCarrera);
    Carrera save(Carrera carrera);
    Carrera upDate(int id, Carrera carrera);
    boolean delete(int id);
}
