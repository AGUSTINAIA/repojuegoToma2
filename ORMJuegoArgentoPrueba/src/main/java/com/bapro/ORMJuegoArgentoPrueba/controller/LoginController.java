package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private JugadorJpaRepositorio JugadorJpaRepositorio;
	
	
	
	@GetMapping ("")
	public String irAlLogin() {
	return "./login/login";
	}
	@PostMapping("/")
	public String comprobarLogin(Model model, Jugador jugador) {
	String mailIngresado = jugador.getEmail();
	String contraseñaIngresada = jugador.getContraseña();
	Jugador jugadorEncontrado = JugadorJpaRepositorio.findByEmail(mailIngresado);
	
	if (jugadorEncontrado == null) {
	return "./Home/home";
	}
	if (jugadorEncontrado.getContraseña().equals(contraseñaIngresada)) {
			model.addAttribute("email", jugadorEncontrado.getEmail());
	return "./partida/comienzo_de_partida";
	}else
	{
	return "./Home/home";
	}
	}

	
}
