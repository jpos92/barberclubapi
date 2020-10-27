package com.beardclub.beardclub.controller;

import java.util.List;
import java.util.Optional;

import com.beardclub.beardclub.classes.Atendimento;
import com.beardclub.beardclub.repository.AtendimentoRepository;

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
@RequestMapping("/atendimentos")
public class AtendimentoController {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @GetMapping
    public List<Atendimento> listar () {
       List<Atendimento> atendimentos =  atendimentoRepository.findAll();
       return atendimentos;
    }

    @PostMapping
    public Atendimento inserir (@RequestBody Atendimento atendimento) {
        Atendimento atendimentoSalvo = atendimentoRepository.save(atendimento);
        return atendimentoSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Atendimento> excluir (@PathVariable Integer id) {
        Optional<Atendimento> atendimentoExcluido = atendimentoRepository.findById(id);
        atendimentoRepository.delete(atendimentoExcluido.get());
        return atendimentoExcluido;
    }

    @PutMapping
    public Atendimento editar (@RequestBody Atendimento atendimento) {
        Atendimento atendimentoEditado = atendimentoRepository.save(atendimento);
        return atendimentoEditado;
    }
    
}
