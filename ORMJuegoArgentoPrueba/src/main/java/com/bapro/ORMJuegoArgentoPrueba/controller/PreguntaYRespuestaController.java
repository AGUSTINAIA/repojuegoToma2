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

   

    @GetMapping("jugar")
    public String getPreguntaRespuesta( Model model, Integer partidaId){
    	model.addAttribute("partidaId", partidaId);
    
    	    	    	
    	        	
        Optional <Partida> optionalPartida =this.partidaJpaRepositorio.findById(partidaId);
        
        Partida unaPartida= optionalPartida.get();
        
        	if (unaPartida.getVidas()> 0 ) {
        		Random miAleatorioTema = new Random();
    			Integer n = (miAleatorioTema.nextInt(6))+1;
    			
    			Optional<Tema> optionalTema = this.temaJpaRepositorio.findById(n);
    			Tema unTema= optionalTema.get();
    			model.addAttribute("tema", unTema);
    			
    			
    			
    			Random miAleatorioPregunta = new Random();
    			Integer p = miAleatorioPregunta.nextInt(unTema.getPreguntasDelTema().size());
    			
    			Pregunta pregunta = unTema.getPreguntasDelTema().get(p);
    			
    			model.addAttribute("pregunta", pregunta);
           
            return "./PreguntaYRespuesta/preguntas_respuestas";
            
        } else {
            return "redirect:/reiniciarPartida";
        }
    }
    
    private List<Pregunta> preguntasPreguntadas ;
        
	@PostMapping("jugar")
	public String comprobarRespuesta(Model model,  Respuesta respuesta, RedirectAttributes redirAttrs,Integer partidaId) {
		
		 Optional <Partida> optionalPartida =this.partidaJpaRepositorio.findById(partidaId);
	        
	        Partida unaPartida= optionalPartida.get();
		
		
	Boolean respuestaIngresada= respuesta.getEsCorrecta();
	Integer respuestaIngresadaId= respuesta.getId();
	Optional<Respuesta> respuestaOp= respuestaJpaRepositorio.findById(respuestaIngresadaId);
	Respuesta respuestaEncontrada= respuestaOp.get();
	
	
	if (respuestaEncontrada.getEsCorrecta()== true) {
		unaPartida.acumularPuntos();
			 this.partidaJpaRepositorio.save(unaPartida);
			
			redirAttrs.addFlashAttribute("mensaje", "Bien! tu respuesta es correcta! Segui jugando...");
			redirAttrs.addFlashAttribute("mensaje1", " PUNTOS ACUMULADOS: " + unaPartida.getPuntos());
			redirAttrs.addFlashAttribute("mensaje2", " VIDAS: " + unaPartida.getVidas());
			redirAttrs.addAttribute("partidaId", unaPartida.getId());
	return "redirect:/jugar";
	
	}
	else
	{
		unaPartida.restarVidas();
		this.partidaJpaRepositorio.save(unaPartida);
		redirAttrs.addFlashAttribute("mensaje", "Respuesta incorrecta... Perdiste una Vida, pero segui jugando!");
		redirAttrs.addFlashAttribute("mensaje1", " PUNTOS ACUMULADOS: " + unaPartida.getPuntos());
		redirAttrs.addFlashAttribute("mensaje2", " VIDAS: " + unaPartida.getVidas());
		redirAttrs.addAttribute("partidaId", unaPartida.getId());

	return "redirect:/jugar";
	}
	}
}
