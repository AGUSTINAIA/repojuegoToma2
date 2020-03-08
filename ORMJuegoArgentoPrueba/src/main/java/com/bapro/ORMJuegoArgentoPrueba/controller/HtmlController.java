package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HtmlController {
	
	@GetMapping("home")
	public String irAlHome() {
		return "./home/home";
	}
	

	@GetMapping("faqs")
	public String irAPreguntas() {
		return "./preguntas/preguntas";
	}
	
	@GetMapping("registroExitoso")
	public String irARegistroExitoso() {
		return "./registroExitoso/registro_exitoso";
	}
	
	

	@GetMapping("reiniciarPartida")
	public String irAReiniciarPartida() {
		return "./PreguntaYRespuesta/ReiniciarPartida";
	}
	
	
	
}
