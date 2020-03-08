package com.bapro.ORMJuegoArgentoPrueba.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.model.Partida;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.PartidaJpaRepositorio;

@Controller
@RequestMapping("partida")

public class PartidaController {
	@Autowired
	private PartidaJpaRepositorio partidaJpaRepositorio;
	
	
	@GetMapping("")
	public String irAPartida(Model model) {
		model.addAttribute("partida",new Partida());
		return "./partida/comienzo_de_partida";
	}

	@PostMapping("")
	public String comenzarAJugar(Partida partidaARegistrar, Model model) {
		
		Partida partidaRegistrada = partidaJpaRepositorio.save(partidaARegistrar);
		return "redirect:/jugar";
	}
}
//	@PostMapping("")
//	public String ingresarPartida(Model model, Jugador jugador,Partida unaPartida, RedirectAttributes redirAttrs) {
//	String apodoIngresado = jugador.getApodo();
//	Integer jugadorApodoIng= jugador.getId();
//	Optional <Jugador> jugadorOp = jugadorJpaRepositorio.findById(jugadorApodoIng);
//	Jugador jugadorEncontrado= jugadorOp.get();
//	
//	if (jugadorEncontrado == null) {
//		
//	return "./partida/comienzo_de_partida";
//	}
//	if (jugadorEncontrado.getApodo().equals(apodoIngresado)) {
//			model.addAttribute("apodo", jugadorEncontrado.getId());
//			partidaJpaRepositorio.save(unaPartida);
//						
//	return "redirect:/jugar";
//	
//	}
//	
//	else
//	{
//    redirAttrs.addFlashAttribute("mensaje", "El Apodo Ingresado no corresponde al jugador");	
//
//	return "./partida/comienzo_de_partida";
//	}
//	}


