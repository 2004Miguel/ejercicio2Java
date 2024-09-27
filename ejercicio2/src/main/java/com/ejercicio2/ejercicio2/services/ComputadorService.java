package com.ejercicio2.ejercicio2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.ejercicio2.ejercicio2.models.Computador;
import com.ejercicio2.ejercicio2.repositories.ComputadorRepo;

public class ComputadorService {

    public void createComputador(@RequestBody Computador computadorp){
        //computadorRepo.save(computadorp);
    }
}
