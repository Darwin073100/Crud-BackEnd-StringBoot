package com.crud.api.crud;

import com.crud.api.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraCrudRepository extends JpaRepository<Carrera, Integer> {
}
