package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bapro.ORMJuegoArgentoPrueba.model.Partida;
import com.bapro.ORMJuegoArgentoPrueba.repository.PartidaJpaRepositorio;

@Controller
@RequestMapping

public class PartidaController {
	@Autowired
	private PartidaJpaRepositorio partidaJpaRepositorio;
	
	@GetMapping("partida")
	public String irAPartida() {
		return "./partida/comienzo_de_partida";
	}

//	public String insertPartida(Partida partida) 	{
//		partidaJpaRepositorio.save(partida);
//		return "./PreguntaYRespuesta/preguntas_respuestas";
//	}

}
