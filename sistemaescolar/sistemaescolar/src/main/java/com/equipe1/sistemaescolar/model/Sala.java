package com.equipe1.sistemaescolar.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_sala")
    private int idSala;

    @Column (name = "nome_sala")
    private String nomeSala;

    @Column (name = "capacidade_sala")
    private Integer capacidadeSala;

}
