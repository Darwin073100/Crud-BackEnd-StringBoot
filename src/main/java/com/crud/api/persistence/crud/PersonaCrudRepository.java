package com.crud.api.persistence.crud;

import com.crud.api.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrudRepository extends CrudRepository<Persona,String> {
}
