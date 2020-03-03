package com.bapro.ORMJuegoArgentoPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;

@Repository
public interface JugadorJpaRepositorio extends JpaRepository<Jugador, Integer> {

	Jugador findByEmail(String email);
//	Jugador findByApodo (String apodo);
}
