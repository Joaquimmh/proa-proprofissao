package com.equipe1j.sistema_escolar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sala")

public class Sala {

    @Id
    @Column(name = "pk_id_sala")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tb_sala")
    private String nome;

    @Column(name = "capacidade")
    private int capacidade;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
