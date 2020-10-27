package com.beardclub.beardclub.repository;

import com.beardclub.beardclub.classes.Localizacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Integer> {
    
}
