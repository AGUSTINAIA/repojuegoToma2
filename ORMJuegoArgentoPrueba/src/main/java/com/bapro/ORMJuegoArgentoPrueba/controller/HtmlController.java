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
	
	@GetMapping("login")
	public String irAlLogin() {
		return "./login/login";
	}
	
	@GetMapping("faqs")
	public String irAPreguntas() {
		return "./preguntas/preguntas";
	}
	
	
	
	@GetMapping("partida")
	public String irAPartida() {
		return "./partida/comienzo_de_partida";
	}
	@GetMapping("pyr")
	public String irAPreguntaYRespuesta() {
		return "./PreguntaYRespuesta/preguntas_respuestas.html";
	}
	
	@PostMapping("pyr")
	public String postPreguntaYRespuesta() {
		System.out.println("Holaaaa");
		return "./PreguntaYRespuesta/preguntas_respuestas.html";
	}
	
	
}
