package com.beardclub.beardclub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BarbeariaController
 */
@RestController
@RequestMapping("/beardclub")
public class BarbeariaController {
    @RequestMapping("/msg")
    public String exibirMensagem () {
        return "Olá!";
    }
    
}