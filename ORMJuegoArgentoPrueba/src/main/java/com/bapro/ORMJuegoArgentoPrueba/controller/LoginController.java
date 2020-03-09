package com.bapro.ORMJuegoArgentoPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	private JugadorJpaRepositorio JugadorJpaRepositorio;

	@GetMapping("")
	public String irAlLogin() {
		return "./login/login";
	}

	@PostMapping("")
	public String comprobarLogin(Model model, Jugador jugador, RedirectAttributes redirAttrs) {
		String mailIngresado = jugador.getEmail();
		String contraseñaIngresada = jugador.getContraseña();
		Jugador jugadorEncontrado = JugadorJpaRepositorio.findByEmail(mailIngresado);

		if (jugadorEncontrado == null) {
			return "redirect:/home";
		}
		if (jugadorEncontrado.getContraseña().equals(contraseñaIngresada)) {
			redirAttrs.addAttribute("jugadorId", jugadorEncontrado.getId());
			
			return "redirect:/partida";

		}

		else {
			redirAttrs.addFlashAttribute("mensaje", "Alguno de los datos es incorrecto, vuelve a intentar");
			return "./login/login";
		}
	}

}
