package com.beardclub.beardclub.controller;

import java.util.List;
import java.util.Optional;

import com.beardclub.beardclub.classes.Cliente;
import com.beardclub.beardclub.repository.ClienteRepository;

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
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar () {
       List<Cliente> clientes =  clienteRepository.findAll();
       return clientes;
    }

    @PostMapping
    public Cliente inserir (@RequestBody Cliente cliente) {
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return clienteSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Cliente> excluir (@PathVariable Integer id) {
        Optional<Cliente> clienteExcluido = clienteRepository.findById(id);
        clienteRepository.delete(clienteExcluido.get());
        return clienteExcluido;
    }

    @PutMapping
    public Cliente editar (@RequestBody Cliente cliente) {
        Cliente clienteEditado = clienteRepository.save(cliente);
        return clienteEditado;
    }
    
}
