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
	@Autowired
	private JugadorJpaRepositorio jugadorJpaRepositorio;
	
	
	@GetMapping("")
	public String irAPartida(Model model,Integer jugadorId) {
		model.addAttribute("partida",new Partida());
		model.addAttribute("jugadorId",jugadorId);
		return "./partida/comienzo_de_partida";
	}

	@PostMapping("")
	public String comenzarAJugar(Partida partidaARegistrar, Model model, Integer jugadorId, RedirectAttributes redirAttrs) {

		Optional<Jugador> jugadorOp= jugadorJpaRepositorio.findById(jugadorId);
		Jugador jugadorEncontrado= jugadorOp.get();
		
		partidaARegistrar.setJugador(jugadorEncontrado);
		Partida partidaRegistrada = partidaJpaRepositorio.save(partidaARegistrar);
		
		redirAttrs.addAttribute("partidaId", partidaRegistrada.getId());
		return "redirect:/jugar";
	}
}


