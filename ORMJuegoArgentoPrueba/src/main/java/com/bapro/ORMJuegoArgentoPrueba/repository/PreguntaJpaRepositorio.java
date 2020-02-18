package com.bapro.ORMJuegoArgentoPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;

@Repository
public interface PreguntaJpaRepositorio extends JpaRepository<Pregunta, Integer>{

}
