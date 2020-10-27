package com.beardclub.beardclub.repository;

import java.math.BigDecimal;

import com.beardclub.beardclub.classes.Barbeiro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BarbeiroRepositoryTest {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    @Test
    public void inserir(){
        Barbeiro b1 = new Barbeiro();
        b1.setNome("João");
        b1.setEmail("jpos@email.com");
        b1.setTelefone("99999-9999");
        b1.setNota(BigDecimal.valueOf(3.67));

        Barbeiro b2 = new Barbeiro();
        b2.setNome("Carlos");
        b2.setEmail("carlos@email.com");
        b2.setTelefone("99569-9999");
        b2.setNota(BigDecimal.valueOf(4.29));

        barbeiroRepository.save(b1);
        barbeiroRepository.save(b2);
    }
    
}