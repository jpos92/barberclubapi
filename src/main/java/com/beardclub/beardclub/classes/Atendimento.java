package com.beardclub.beardclub.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Barbeiro barbeiro;
    
    @Column(nullable = true, precision = 3, scale = 2)
    private BigDecimal nota_barbeiro;

    @Column(nullable = true, precision = 3, scale = 2)
    private BigDecimal nota_cliente;

    @Column(nullable = false)
    private LocalDate data_requisicao;

    @Column(nullable = false, precision = 3, scale = 2)
    private BigDecimal valor;

    @OneToOne
    @JoinColumn(nullable = false)
    private Localizacao localizacao;
}
