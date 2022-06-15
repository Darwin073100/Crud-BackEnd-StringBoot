package com.crud.api.crud;

import com.crud.api.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaCrudRepository extends JpaRepository<Persona,String> {
}
