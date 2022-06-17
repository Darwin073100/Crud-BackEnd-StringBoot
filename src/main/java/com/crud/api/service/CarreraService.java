package com.crud.api.service;

import com.crud.api.crud.CarreraCrudRepository;
import com.crud.api.entity.Carrera;
import com.crud.api.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarreraService implements CarreraRepository {

    @Autowired
    private CarreraCrudRepository carreraCrudRepository;
    /**
     * @return 
     */
    @Override
    public List<Carrera> getAll() {
        return (List<Carrera>) carreraCrudRepository.findAll();
    }

    /**
     * @param idCarrera 
     * @return
     */
    @Override
    public Optional<Carrera> getCarrera(int idCarrera) {
        return carreraCrudRepository.findById(idCarrera);
    }

    /**
     * @param carrera 
     * @return
     */
    @Override
    public Carrera save(Carrera carrera) {
        return carreraCrudRepository.save(carrera);
    }

    /**
     * @param id 
     * @param carrera
     * @return
     */
    @Override
    public Carrera upDate(int id, Carrera carrera) {
        carrera.setId(id);
        return carreraCrudRepository.saveAndFlush(carrera);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public boolean delete(int id) {
        return getCarrera(id).map(carrera -> {
            carreraCrudRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
