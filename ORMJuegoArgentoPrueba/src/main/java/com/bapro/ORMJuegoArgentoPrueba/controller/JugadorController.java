package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;

@Controller
@RequestMapping
public class JugadorController {
	@Autowired
	private JugadorJpaRepositorio jugadorJpaRepositorio;
	
	@GetMapping("registro")
	public String irARegistro() {
		return "./registro/registro";
	}
	
	@PostMapping ("registro")
	public String insertJugador (Jugador unJugador) {
		jugadorJpaRepositorio.save(unJugador);
		return "./partida/comienzo_de_partida";
	}
}
