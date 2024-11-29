package com.equipe1.sistemaescolar.repositories;

import com.equipe1.sistemaescolar.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Long> {
}
