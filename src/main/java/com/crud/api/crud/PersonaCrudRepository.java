package com.crud.api.crud;

import com.crud.api.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrudRepository extends CrudRepository<Persona,String> {
}
