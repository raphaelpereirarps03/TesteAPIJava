package com.equipe1.sistemaescolar.model;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_aluno")

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_aluno")
    private long idAluno;

    @Column (name = "nome_aluno")
    private String nomeAluno;

    @Column (name = "email_aluno")
    private String emailAluno;

    @Column (name = "data_nascimento_aluno")
    private Date dataNascimentoAluno;

    /*@ManyToOne
    private Presenca presenca;*/

    @ManyToOne
    private Professor professor;

    @ManyToOne
    private Sala sala;


    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public Date getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno(Date dataNascimentoAluno) {
        this.dataNascimentoAluno = dataNascimentoAluno;
    }
}
