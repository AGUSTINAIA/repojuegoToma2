package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping ("reiniciar")

public class reiniciarPartidaController {

	@GetMapping("")
	public String irAPartida() {
		return "./partida/reiniciarPartida";
	}

}
