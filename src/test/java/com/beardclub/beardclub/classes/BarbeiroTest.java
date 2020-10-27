package com.beardclub.beardclub.classes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BarbeiroTest {
    
    @Test
    public void criar () {
        Barbeiro b1 = new Barbeiro();
        b1.setNome("João");
        b1.setEmail("jpos@email.com");
        b1.setTelefone("99999-9999");
        b1.setNota(null);
    }
    
}
