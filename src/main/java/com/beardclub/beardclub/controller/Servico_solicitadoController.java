package com.beardclub.beardclub.controller;

import java.util.List;
import java.util.Optional;

import com.beardclub.beardclub.classes.Servico_solicitado;
import com.beardclub.beardclub.repository.Servico_solicitadoRepository;

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
@RequestMapping("/servicos_solicitados")
public class Servico_solicitadoController {

    @Autowired
    private Servico_solicitadoRepository servico_solicitadoRepository;

    @GetMapping
    public List<Servico_solicitado> listar () {
       List<Servico_solicitado> servico_solicitados =  servico_solicitadoRepository.findAll();
       return servico_solicitados;
    }

    @PostMapping
    public Servico_solicitado inserir (@RequestBody Servico_solicitado servico_solicitado) {
        Servico_solicitado servico_solicitadoSalvo = servico_solicitadoRepository.save(servico_solicitado);
        return servico_solicitadoSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Servico_solicitado> excluir (@PathVariable Integer id) {
        Optional<Servico_solicitado> servico_solicitadoExcluido = servico_solicitadoRepository.findById(id);
        servico_solicitadoRepository.delete(servico_solicitadoExcluido.get());
        return servico_solicitadoExcluido;
    }

    @PutMapping
    public Servico_solicitado editar (@RequestBody Servico_solicitado servico_solicitado) {
        Servico_solicitado servico_solicitadoEditado = servico_solicitadoRepository.save(servico_solicitado);
        return servico_solicitadoEditado;
    }
    
}
