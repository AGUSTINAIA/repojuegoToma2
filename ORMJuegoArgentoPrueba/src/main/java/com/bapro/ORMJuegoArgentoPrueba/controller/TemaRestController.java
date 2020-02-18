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


import com.bapro.ORMJuegoArgentoPrueba.model.Tema;
import com.bapro.ORMJuegoArgentoPrueba.repository.TemaJpaRepositorio;

@RestController
@RequestMapping("temas")
public class TemaRestController {
	
	@Autowired
	private TemaJpaRepositorio TemaJpaRepositorio;
	
	@GetMapping("")
	public List<Tema> getJTemas(){
		List<Tema> temas = TemaJpaRepositorio.findAll();
		return temas;
	}
	
	@GetMapping("{id}")
	public Tema getTemaId(@PathVariable ("id") Integer id) {
		Optional<Tema> temaPorId = TemaJpaRepositorio.findById(id);
		return temaPorId.get();
	}
	
	@PostMapping("")
	public Tema InserTema(@RequestBody Tema temaARegistrar) {
		Tema temaRegistrado = TemaJpaRepositorio.save(temaARegistrar);
		return temaRegistrado;
	}
	
	@DeleteMapping("{id}")
	public void deleteTema (@PathVariable("id") Integer id) {
		TemaJpaRepositorio.deleteById(id);
		
	}

}
