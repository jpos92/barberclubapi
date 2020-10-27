package com.beardclub.beardclub.controller;

import java.util.List;
import java.util.Optional;

import com.beardclub.beardclub.classes.Barbeiro;
import com.beardclub.beardclub.repository.BarbeiroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barbeiros")
public class BarbeiroController {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    @GetMapping
    public List<Barbeiro> listar () {
       List<Barbeiro> barbeiros =  barbeiroRepository.findAll();
       return barbeiros;
    }

    @PostMapping
    public Barbeiro inserir (@RequestBody Barbeiro barbeiro) {
        Barbeiro barbeiroSalvo = barbeiroRepository.save(barbeiro);
        return barbeiroSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Barbeiro> excluir (@PathVariable Integer id) {
        Optional<Barbeiro> barbeiroExcluido = barbeiroRepository.findById(id);
        barbeiroRepository.delete(barbeiroExcluido.get());
        return barbeiroExcluido;
    }

    @PutMapping
    public Barbeiro editar (@RequestBody Barbeiro barbeiro) {
        Barbeiro barbeiroEditado = barbeiroRepository.save(barbeiro);
        return barbeiroEditado;
    }
    
}
