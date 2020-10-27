package com.beardclub.beardclub.classes;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(length = 300, nullable = false)
    private String descricao;

    @Column(precision = 3, scale = 2)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Barbeiro barbeiro;
    
}
