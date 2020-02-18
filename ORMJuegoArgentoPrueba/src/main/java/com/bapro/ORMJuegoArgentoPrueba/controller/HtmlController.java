package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	@GetMapping("preguntas")
	public String irAPreguntas() {
		return "./preguntas/preguntas";
	}
	
	@GetMapping("registro")
	public String irARegistro() {
		return "./registro/registro";
	}

}
