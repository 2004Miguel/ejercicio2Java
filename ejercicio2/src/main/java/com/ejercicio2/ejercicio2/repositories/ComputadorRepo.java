package com.ejercicio2.ejercicio2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio2.ejercicio2.models.Computador;

@Repository
public interface ComputadorRepo extends JpaRepository<Computador, Long> {

    
}