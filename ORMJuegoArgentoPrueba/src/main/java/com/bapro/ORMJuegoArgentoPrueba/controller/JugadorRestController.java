package com.bapro.ORMJuegoArgentoPrueba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;

@RestController
@RequestMapping("jugadores")
public class JugadorRestController {

	@Autowired
	private JugadorJpaRepositorio jugadorJpaRepositorio;
	
	@GetMapping("")
	public List<Jugador> getJugadores(){
		List<Jugador> jugadores = jugadorJpaRepositorio.findAll();
		return jugadores;
	}
	
	@GetMapping("{id}")
	public Jugador getJugadorById(@PathVariable ("id") Integer id) {
		Optional<Jugador> jugadorPorId = jugadorJpaRepositorio.findById(id);
		return jugadorPorId.get();
	}
	
	@PostMapping("")
	public Jugador insertJugador(@RequestBody Jugador jugadorARegistrar) {
		Jugador jugadorRegistrado = jugadorJpaRepositorio.save(jugadorARegistrar);
		return jugadorRegistrado;
	}
	
	@DeleteMapping("{id}")
	public void deleteJugador (@PathVariable("id") Integer id) {
		jugadorJpaRepositorio.deleteById(id);
		
	}
}

