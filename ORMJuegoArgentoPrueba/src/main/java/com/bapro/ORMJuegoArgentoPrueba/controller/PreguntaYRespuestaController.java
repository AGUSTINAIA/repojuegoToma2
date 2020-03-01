package com.bapro.ORMJuegoArgentoPrueba.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;
import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.services.PreguntaService;
import com.bapro.ORMJuegoArgentoPrueba.services.RespuestaService;

@Controller
@RequestMapping ("/PreguntaYRespuesta")
public class PreguntaYRespuestaController {
	
    private PreguntaService preguntaService;
	
    private RespuestaService respuestaService;

    public PreguntaYRespuestaController(PreguntaService preguntaService, RespuestaService respuestaService)
    {
        this.preguntaService = preguntaService;
        this.respuestaService = respuestaService;
    }
//    @GetMapping ("")
//    public String irAPreguntaYRespuesta() {
//    	return "./PreguntaYRespuesta/preguntas_respuestas";
//    }

    @GetMapping("/quizz/{id}")
    public String getQuestion(@PathVariable(value = "id") Integer id, Model model)
    {
        try {
            Pregunta pregunta = this.preguntaService.findById(id);
            model.addAttribute("pregunta", pregunta);
            return "./PreguntaYRespuesta/preguntas_respuestas";
        } catch (Exception e) {
            return "./PreguntaYRespuesta/not-found";
        }
    }

    @PostMapping("/quizz/{id}")
    public String respuestaPregunta(@PathVariable(value = "id") Integer id, @ModelAttribute("respuesta") Integer answer_id, Model model)
    {
        try {
            Pregunta pregunta = this.preguntaService.findById(id);
            Respuesta respuesta = this.respuestaService.findById(answer_id);

            Boolean correct = this.preguntaService.isCorrectAnswer(pregunta, respuesta);

            model.addAttribute("pregunta", pregunta);
            model.addAttribute("respuesta", respuesta);
            model.addAttribute("correct", correct);

            return "./PreguntaYRespuesta/question-answered";
        } catch (Exception e) {
            return "./PreguntaYRespuesta/not-found";
        }
    }

}
