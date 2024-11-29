package com.equipe1.sistemaescolar.controller;

import com.equipe1.sistemaescolar.model.Aluno;
import com.equipe1.sistemaescolar.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;


    @GetMapping
    public List <Aluno> getAllAlunos(){
        return alunoRepository.findAll();
    }
}
