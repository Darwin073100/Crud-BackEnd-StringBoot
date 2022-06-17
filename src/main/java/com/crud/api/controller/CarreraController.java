package com.crud.api.controller;

import com.crud.api.entity.Carrera;
import com.crud.api.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrera")
public class CarreraController {

    @Autowired
    private CarreraService carreraService;

    @GetMapping("all")
    public ResponseEntity<List<Carrera>> getAll(){
        return new ResponseEntity<>(carreraService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idCarrera}")
    public ResponseEntity<Carrera> getCarrera(@PathVariable int idCarrera){
        return  carreraService.getCarrera(idCarrera)
                .map(carrera -> new ResponseEntity<>(carrera, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Carrera> save(@RequestBody Carrera carrera){
        return new ResponseEntity<>(carreraService.save(carrera),HttpStatus.CREATED);
    }

    @PutMapping("/update/{idCarrera}")
    public ResponseEntity<Carrera> upDate(@PathVariable int idCarrera, @RequestBody Carrera carrera){
        return new ResponseEntity<>(carreraService.upDate(idCarrera,carrera), HttpStatus.OK);
    }

    @DeleteMapping("delete/{idCarrera}")
    public ResponseEntity delete(@PathVariable int idCarrera){
        if (carreraService.delete(idCarrera)){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
