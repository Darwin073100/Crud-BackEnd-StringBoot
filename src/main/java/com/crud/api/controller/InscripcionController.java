package com.crud.api.controller;

import com.crud.api.entity.Inscripcion;
import com.crud.api.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @GetMapping
    public ResponseEntity<List<Inscripcion>> getAll(){
        return new ResponseEntity<>(inscripcionService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inscripcion> getInscripcion(@PathVariable int id){
        return inscripcionService.getInscripcion(id)
                .map(inscripcion -> new ResponseEntity<>(inscripcion,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Inscripcion> save(@RequestBody Inscripcion inscripcion){
        return  new ResponseEntity<>(inscripcionService.save(inscripcion),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inscripcion> upDate(@PathVariable int id, @RequestBody Inscripcion inscripcion){
        return  new ResponseEntity<>(inscripcionService.upDate(id, inscripcion),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if (inscripcionService.delete(id)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
