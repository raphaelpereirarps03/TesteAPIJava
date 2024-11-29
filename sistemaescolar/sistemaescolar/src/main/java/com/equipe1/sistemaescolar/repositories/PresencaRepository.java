package com.equipe1.sistemaescolar.repositories;

import com.equipe1.sistemaescolar.model.Presenca;
import com.equipe1.sistemaescolar.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository <Presenca, Long>{
}
