package com.bapro.ORMJuegoArgentoPrueba.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;

@Controller
@RequestMapping
public class JugadorController {
	@Autowired
	private JugadorJpaRepositorio jugadorJpaRepositorio;
	
	@GetMapping("registro")
	public String irARegistro(Model model) {
		model.addAttribute("jugador",new Jugador());
		return "./registro/registro";
	}
	
	@PostMapping ("registro")
	public String insertJugador ( @Valid Jugador unJugador, BindingResult resultadoDeValidacion, Model model) {
		if (resultadoDeValidacion.hasErrors()) {
		
			return "./registro/registro";
		}
		
		Jugador jugadorNuevo = jugadorJpaRepositorio.save(unJugador);
		return "./registroExitoso/registro_exitoso";
	}
	
	
	
	
}
