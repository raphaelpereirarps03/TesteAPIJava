package com.equipe1.sistemaescolar.repositories;

import com.equipe1.sistemaescolar.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository <Professor, Long> {
}
