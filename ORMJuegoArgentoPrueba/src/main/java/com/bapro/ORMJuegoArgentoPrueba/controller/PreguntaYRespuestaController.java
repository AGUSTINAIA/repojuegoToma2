package com.bapro.ORMJuegoArgentoPrueba.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;
import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.model.Tema;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.RespuestaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.TemaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.services.PreguntaService;
import com.bapro.ORMJuegoArgentoPrueba.services.RespuestaService;


@Controller
@RequestMapping 
public class PreguntaYRespuestaController {

	
    private PreguntaService preguntaService;
	
    private RespuestaService respuestaService;
    
    private JugadorJpaRepositorio jugadorJpaRepositorio;

    private TemaJpaRepositorio temaJpaRepositorio;
    
    private PreguntaJpaRepositorio preguntaJpaRepositorio;
    
    private RespuestaJpaRepositorio respuestaJpaRepositorio;

    public PreguntaYRespuestaController(PreguntaService preguntaService, RespuestaService respuestaService
    		, JugadorJpaRepositorio jugadorJpaRepositorio, TemaJpaRepositorio temaJpaRepositorio,PreguntaJpaRepositorio preguntaJpaRepositorio, RespuestaJpaRepositorio respuestaJpaRepositorio)
    {
        this.preguntaService = preguntaService;
        this.respuestaService = respuestaService;
        this.jugadorJpaRepositorio =  jugadorJpaRepositorio;
        this.temaJpaRepositorio= temaJpaRepositorio;
        this.preguntaJpaRepositorio= preguntaJpaRepositorio;
        this.respuestaJpaRepositorio= respuestaJpaRepositorio;
    }
//    @GetMapping ("jugar")
//    public String irAPreguntaYRespuesta(Model model) {
//   	return "./PreguntaYRespuesta/preguntas_respuestas";
//    }

    @GetMapping("jugar")
    public String getPreguntaRespuesta( Model model)
    {
    	Optional<Jugador> optionalJugador = this.jugadorJpaRepositorio.findById(10);
     
        	Jugador unJugador= optionalJugador.get();
        	
        	if (unJugador.getVidas()> 0 ) {
        		Random miAleatorioTema = new Random();
    			Integer n = miAleatorioTema.nextInt(6);
    			
    			Optional<Tema> optionalTema = this.temaJpaRepositorio.findById(n);
    			Tema unTema= optionalTema.get();
    			
    			Random miAleatorioPregunta = new Random();
    			Integer p = miAleatorioPregunta.nextInt(unTema.getPreguntasDelTema().size());
    		
    			Pregunta pregunta = unTema.getPreguntasDelTema().get(p);
    			
    			model.addAttribute("pregunta", pregunta);
           
            return "./PreguntaYRespuesta/preguntas_respuestas";
            
        } else {
            return "./PreguntaYRespuesta/not-found";
        }
    }

    @PostMapping("jugar")
    public String elegirRespuesta( Pregunta pregunta, @ModelAttribute("respuesta") Respuesta respuesta, Model model)
    {
    	
       return "./PreguntaYRespuesta/question-answered";
       
    }

}
