package com.equipe1j.sistema_escolar.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")

public class Presenca {

    @Id
    @Column(name = "pk_id_presenca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_presenca")
    private Date dataPresenca;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Professor professor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataPresenca() {
        return dataPresenca;
    }

    public void setDataPresenca(Date dataPresenca) {
        this.dataPresenca = dataPresenca;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
