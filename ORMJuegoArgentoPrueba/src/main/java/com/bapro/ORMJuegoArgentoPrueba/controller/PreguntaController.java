package com.bapro.ORMJuegoArgentoPrueba.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;
import com.bapro.ORMJuegoArgentoPrueba.model.Tema;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.TemaJpaRepositorio;



@Controller
@RequestMapping
public class PreguntaController {

	
	
		@Autowired
		private PreguntaJpaRepositorio preguntaJpaRepositorio;
		//@Autowired
		//private TemaJpaRepositorio temaJpaRepositorio;
		
	
		
		@GetMapping("formulario_pregunta")
		public String irAlFormularioPreguntas (Model model) {
			//List<Tema> listadoDeTemas = temaJpaRepositorio.findAll();
			//model.addAttribute("pregunta", new Pregunta());
			return "./formulario_preguntas/formulario_preguntas";
		}
		
		@PostMapping("formulario_pregunta")
		public String insertPregunta( Pregunta preguntaARegistrar) {
			Pregunta preguntaRegistrada = preguntaJpaRepositorio.save(preguntaARegistrar);
			return "./formulario_preguntas/formulario_preguntas";
		}
		
	

		
		
	}


