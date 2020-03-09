package com.bapro.ORMJuegoArgentoPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.model.Partida;
@Repository
public interface PartidaJpaRepositorio extends JpaRepository<Partida, Integer>{

	
	
}
