package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.repository.RespuestaJpaRepositorio;

@Controller
@RequestMapping
public class RespuestaController {
	@Autowired
	private RespuestaJpaRepositorio respuestaJpaRepositorio;
	
	@GetMapping("formulario_respuestas")
	public String irAlFormularioRespuesta(Model model) {
		return "./formulario_respuestas/formulario_respuestas";
	}
	
	@PostMapping("formulario_respuestas")
	public String insertRespuesta(Respuesta respuestaARegistrar) {
		Respuesta respuestaRegistrada = respuestaJpaRepositorio.save(respuestaARegistrar);
		return "./formulario_respuestas/formulario_respuestas";
	}
}
