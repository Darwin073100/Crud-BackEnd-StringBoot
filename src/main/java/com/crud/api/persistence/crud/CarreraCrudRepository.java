package com.crud.api.persistence.crud;

import com.crud.api.persistence.entity.Carrera;
import org.springframework.data.repository.CrudRepository;

public interface CarreraCrudRepository extends CrudRepository<Carrera, Integer> {
}
