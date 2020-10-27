package com.beardclub.beardclub.controller;

import java.util.List;
import java.util.Optional;

import com.beardclub.beardclub.classes.Servico;
import com.beardclub.beardclub.repository.ServicoRepository;

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
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    public List<Servico> listar () {
       List<Servico> servicos =  servicoRepository.findAll();
       return servicos;
    }

    @PostMapping
    public Servico inserir (@RequestBody Servico servico) {
        Servico servicoSalvo = servicoRepository.save(servico);
        return servicoSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Servico> excluir (@PathVariable Integer id) {
        Optional<Servico> servicoExcluido = servicoRepository.findById(id);
        servicoRepository.delete(servicoExcluido.get());
        return servicoExcluido;
    }

    @PutMapping
    public Servico editar (@RequestBody Servico servico) {
        Servico servicoEditado = servicoRepository.save(servico);
        return servicoEditado;
    }
    
}
