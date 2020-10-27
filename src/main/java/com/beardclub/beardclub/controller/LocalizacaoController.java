package com.beardclub.beardclub.controller;

import java.util.List;
import java.util.Optional;

import com.beardclub.beardclub.classes.Localizacao;
import com.beardclub.beardclub.repository.LocalizacaoRepository;

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
@RequestMapping("/localizacoes")
public class LocalizacaoController {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    @GetMapping
    public List<Localizacao> listar () {
       List<Localizacao> localizacaos =  localizacaoRepository.findAll();
       return localizacaos;
    }

    @PostMapping
    public Localizacao inserir (@RequestBody Localizacao localizacao) {
        Localizacao localizacaoSalvo = localizacaoRepository.save(localizacao);
        return localizacaoSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Localizacao> excluir (@PathVariable Integer id) {
        Optional<Localizacao> localizacaoExcluido = localizacaoRepository.findById(id);
        localizacaoRepository.delete(localizacaoExcluido.get());
        return localizacaoExcluido;
    }

    @PutMapping
    public Localizacao editar (@RequestBody Localizacao localizacao) {
        Localizacao localizacaoEditado = localizacaoRepository.save(localizacao);
        return localizacaoEditado;
    }
    
}