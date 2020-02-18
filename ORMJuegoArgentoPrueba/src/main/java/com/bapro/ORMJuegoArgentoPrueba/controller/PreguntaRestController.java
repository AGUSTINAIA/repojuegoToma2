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


import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;
import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;

@RestController
@RequestMapping("preguntas")
public class PreguntaRestController {

	@Autowired
	private PreguntaJpaRepositorio PreguntaJpaRepositorio;
	
	@GetMapping("")
	public List<Pregunta> getPreguntas(){
		List<Pregunta> preguntas = PreguntaJpaRepositorio.findAll();
		return preguntas;
	}
	
	@GetMapping("{id}")
	public Pregunta getPreguntaId(@PathVariable ("id") Integer id) {
		Optional<Pregunta> preguntaPorId = PreguntaJpaRepositorio.findById(id);
		return preguntaPorId.get();
	}
	
	@PostMapping("")
	public Pregunta insertPregunta(@RequestBody Pregunta preguntaARegistrar) {
		Pregunta preguntaRegistrada = PreguntaJpaRepositorio.save(preguntaARegistrar);
		return preguntaRegistrada;
	}
	
	@DeleteMapping("{id}")
	public void deletePregunta (@PathVariable("id") Integer id) {
		PreguntaJpaRepositorio.deleteById(id);
		
	}
	

	
	
}
