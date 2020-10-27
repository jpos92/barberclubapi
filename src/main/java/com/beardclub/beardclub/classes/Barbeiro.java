package com.beardclub.beardclub.classes;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Barbeiro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 150, nullable = false)
    private String cpf;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(length = 150, nullable = false, unique = true)
    private String email;

    @Column(length = 150, nullable = false, unique = true)
    private String telefone;

    @Column(nullable = false, precision = 3, scale = 2)
    private BigDecimal nota;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private boolean tipoUser;

    @OneToOne
    @JoinColumn(nullable = false)
    private Localizacao localizacao;

}
