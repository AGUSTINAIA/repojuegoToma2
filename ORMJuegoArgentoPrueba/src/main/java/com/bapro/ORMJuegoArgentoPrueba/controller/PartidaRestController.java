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

import com.bapro.ORMJuegoArgentoPrueba.model.Partida;
import com.bapro.ORMJuegoArgentoPrueba.repository.PartidaJpaRepositorio;
@RestController
@RequestMapping ("partidas")
public class PartidaRestController {
	
@Autowired
private PartidaJpaRepositorio partidaJpaRepositorio;


	@GetMapping("")
	public List<Partida> getPartidas(){
		List<Partida> partidas = partidaJpaRepositorio.findAll();
		return partidas;
	}
	
	@GetMapping("{id}")
	public Partida getPartidaById(@PathVariable ("id") Integer id) {
		Optional<Partida> partidaPorId = partidaJpaRepositorio.findById(id);
		return partidaPorId.get();
	}
	
	@PostMapping("")
	public Partida insertPartida(@RequestBody Partida partidaARegistrar) {
		Partida partidaRegistrada = partidaJpaRepositorio.save(partidaARegistrar);
		return partidaRegistrada;
	}
	
	@DeleteMapping("{id}")
	public void deletePartida (@PathVariable("id") Integer id) {
		partidaJpaRepositorio.deleteById(id);
		
	}
}



