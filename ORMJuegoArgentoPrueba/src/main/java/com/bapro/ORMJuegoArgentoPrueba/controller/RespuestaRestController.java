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

import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.repository.RespuestaJpaRepositorio;

@RestController
@RequestMapping("respuestas")
public class RespuestaRestController {
	
	@Autowired
	private RespuestaJpaRepositorio RespuestaJpaRepositorio;

	
	@GetMapping("")
	public List<Respuesta> getRespuestas(){
		List<Respuesta> respuestas = RespuestaJpaRepositorio.findAll();
		return respuestas;
	}
	
	@GetMapping("{id}")
	public Respuesta getRespuestaPorIdId(@PathVariable ("id") Integer id) {
		Optional<Respuesta> respuestaPorId = RespuestaJpaRepositorio.findById(id);
		return respuestaPorId.get();
	}
	
	@PostMapping("")
	public Respuesta InserRespuesta(@RequestBody Respuesta respuestaARegistrar) {
		Respuesta respuestaRegistrada = RespuestaJpaRepositorio.save(respuestaARegistrar);
		return respuestaRegistrada;
	}
	
	@DeleteMapping("{id}")
	public void deleteRespuesta (@PathVariable("id") Integer id) {
		RespuestaJpaRepositorio.deleteById(id);
		
	}
}
