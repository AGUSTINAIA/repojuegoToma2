package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String irAReiniciarPartida(Model model,Integer partidaPuntos,RedirectAttributes redirAttrs) {
		model.addAttribute("partidaPuntos", partidaPuntos);
		return "./PreguntaYRespuesta/ReiniciarPartida";
	}
	
	
	
}
