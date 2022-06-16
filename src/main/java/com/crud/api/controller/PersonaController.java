package com.crud.api.controller;

import com.crud.api.entity.Persona;
import com.crud.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAll() {
        return new ResponseEntity<>(personaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getFindById(@PathVariable String id) {
        return personaService.getProduct(id)
                .map(persona -> new ResponseEntity<>(persona, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Persona> upDate(@RequestBody Persona persona ,@PathVariable String id){
        return new ResponseEntity<>(personaService.upDate(persona,id), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String idPersona){
        if (personaService.delete(idPersona)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}
