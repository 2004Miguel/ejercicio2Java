package com.ejercicio2.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio2.ejercicio2.models.Computador;
import com.ejercicio2.ejercicio2.repositories.ComputadorRepo;
import com.ejercicio2.ejercicio2.services.ComputadorService;

@RestController
public class ComputadorController {

    @Autowired
    private ComputadorRepo computadorRepo;
   // private ComputadorService compuService = new ComputadorService();

    @PostMapping("/computadores")//funciona
    public void createComputador(@RequestBody Computador computador){
        //compuService.createComputador(computador);
        computadorRepo.save(computador);
    }

    @GetMapping("/computadores")//funciona
    public List<Computador> seeComputadores(){
        return computadorRepo.findAll();
    }

    @DeleteMapping("/computadores")
    public void deleteComputador(@RequestParam(value = "id") Long id){
        computadorRepo.deleteById(id);
    }

    @PutMapping("/computadores")
    public void updateComputador(@RequestParam(value = "id") Long id, @RequestBody Computador computador){
        computadorRepo.deleteById(id);
        computadorRepo.save(computador);   
    }
}
