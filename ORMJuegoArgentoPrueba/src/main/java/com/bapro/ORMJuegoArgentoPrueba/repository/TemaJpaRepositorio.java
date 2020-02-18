package com.bapro.ORMJuegoArgentoPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bapro.ORMJuegoArgentoPrueba.model.Tema;

@Repository
public interface TemaJpaRepositorio extends JpaRepository<Tema, Integer> {

}
