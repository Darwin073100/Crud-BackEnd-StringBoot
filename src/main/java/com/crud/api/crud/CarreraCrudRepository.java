package com.crud.api.crud;

import com.crud.api.entity.Carrera;
import org.springframework.data.repository.CrudRepository;

public interface CarreraCrudRepository extends CrudRepository<Carrera, Integer> {
}
