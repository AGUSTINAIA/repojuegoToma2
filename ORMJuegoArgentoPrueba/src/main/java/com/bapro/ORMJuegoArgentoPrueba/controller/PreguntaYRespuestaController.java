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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bapro.ORMJuegoArgentoPrueba.model.Jugador;
import com.bapro.ORMJuegoArgentoPrueba.model.Partida;
import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;
import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.model.Tema;
import com.bapro.ORMJuegoArgentoPrueba.repository.JugadorJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.PartidaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.RespuestaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.TemaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;
import com.bapro.ORMJuegoArgentoPrueba.services.PreguntaService;
import com.bapro.ORMJuegoArgentoPrueba.services.RespuestaService;



@Controller
@RequestMapping 
public class PreguntaYRespuestaController {

	@Autowired
    private PreguntaService preguntaService;
	@Autowired
    private RespuestaService respuestaService;
	@Autowired
    private JugadorJpaRepositorio jugadorJpaRepositorio;
	@Autowired
    private TemaJpaRepositorio temaJpaRepositorio;
	@Autowired
    private PreguntaJpaRepositorio preguntaJpaRepositorio;
	@Autowired
    private RespuestaJpaRepositorio respuestaJpaRepositorio;
	@Autowired
	private PartidaJpaRepositorio partidaJpaRepositorio;

    
//    @GetMapping ("jugar")
//    public String irAPreguntaYRespuesta(Model model) {
//   	return "./PreguntaYRespuesta/preguntas_respuestas";
//    }

    @GetMapping("jugar")
    public String getPreguntaRespuesta( Model model)
    
    {

    	    	
    	
    	//Optional<Jugador> optionalJugador = this.jugadorJpaRepositorio.findById(12);
     
        //	Jugador unJugador= optionalJugador.get();
        	
        Optional <Partida> optionalPartida =this.partidaJpaRepositorio.findById(4);
        
        Partida unaPartida= optionalPartida.get();
        
        	if (unaPartida.getVidas()> 0 ) {
        		Random miAleatorioTema = new Random();
    			Integer n = (miAleatorioTema.nextInt(5))+1;
    			
    			Optional<Tema> optionalTema = this.temaJpaRepositorio.findById(n);
    			Tema unTema= optionalTema.get();
    			model.addAttribute("tema", unTema);
    			
    			
    			
    			Random miAleatorioPregunta = new Random();
    			Integer p = miAleatorioPregunta.nextInt(unTema.getPreguntasDelTema().size());
    		
    			Pregunta pregunta = unTema.getPreguntasDelTema().get(p);
    			
    			model.addAttribute("pregunta", pregunta);
           
            return "./PreguntaYRespuesta/preguntas_respuestas";
            
        } else {
            return "./PreguntaYRespuesta/preguntas_respuestas";
        }
    }
    
    
//
//    @PostMapping("jugar")
//    public String elegirRespuesta( Pregunta pregunta, @ModelAttribute("respuesta") Respuesta respuesta, Model model)
//    {
//  
//       return "./PreguntaYRespuesta/question-answered";
//       
//    }

//    @PostMapping("jugar")
//    public String responderPregunta( Pregunta pregunta, @ModelAttribute("respuesta") Respuesta respuesta, Model model)
//    {
//        try {
//        	Pregunta preguntaAleatoria = this.preguntaService.findById(pregunta.getId());
//            Respuesta respuestaElegida = this.respuestaService.findById(respuesta.getId());
//
//            Boolean correct = this.preguntaService.isCorrectAnswer(pregunta, respuesta);
//
//            model.addAttribute("pregunta", preguntaAleatoria);
//            model.addAttribute("respuesta", respuestaElegida);
//            model.addAttribute("correct", correct);
//
//            return "./PreguntaYRespuesta/question-answered";
//        } catch (Exception e) {
//            return "./PreguntaYRespuesta/not-found";
//        }
//    }
	@PostMapping("jugar")
	public String comprobarRespuesta(Model model,  Respuesta respuesta, RedirectAttributes redirAttrs) {
	//	Optional<Jugador> optionalJugador = this.jugadorJpaRepositorio.findById(12);
	     
   // 	Jugador unJugador= optionalJugador.get();
		 Optional <Partida> optionalPartida =this.partidaJpaRepositorio.findById(4);
	        
	        Partida unaPartida= optionalPartida.get();
		
		
	Boolean respuestaIngresada= respuesta.getEsCorrecta();
	Integer respuestaIngresadaId= respuesta.getId();
	Optional<Respuesta> respuestaOp= respuestaJpaRepositorio.findById(respuestaIngresadaId);
	Respuesta respuestaEncontrada= respuestaOp.get();
	
	
	if (respuestaEncontrada.getEsCorrecta()== true) {
		unaPartida.acumularPuntos();
			 this.partidaJpaRepositorio.save(unaPartida);
			System.out.println(unaPartida.getPuntos());
			redirAttrs.addFlashAttribute("mensaje", "Bien! tu respuesta es correcta! sumaste puntos! Siguiente Pregunta...");	
	return "redirect:/jugar";
	
	}
	else
	{
		unaPartida.restarVidas();
		this.partidaJpaRepositorio.save(unaPartida);
		redirAttrs.addFlashAttribute("mensaje", ":/ Respuesta incorrecta... Perdiste una Vida, pero segui jugando!");
	return "redirect:/jugar";
	}
	}
}
