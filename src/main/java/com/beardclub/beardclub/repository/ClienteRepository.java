package com.beardclub.beardclub.repository;

import com.beardclub.beardclub.classes.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
 
}