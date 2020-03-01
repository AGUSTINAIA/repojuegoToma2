package com.bapro.ORMJuegoArgentoPrueba.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bapro.ORMJuegoArgentoPrueba.model.Pregunta;
import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.repository.PreguntaJpaRepositorio;

@Service
public class PreguntaService {

    private PreguntaJpaRepositorio preguntaJpaRepositorio;

    public PreguntaService (PreguntaJpaRepositorio preguntaJpaRepositorio)
    {
        this.preguntaJpaRepositorio = preguntaJpaRepositorio;
    }

    public List<Pregunta> findAll()
    {
        return this.preguntaJpaRepositorio.findAll();
    }

    public Pregunta findById(Integer id) throws Exception
    {
        Optional<Pregunta> pregunta = this.preguntaJpaRepositorio.findById(id);

        if (pregunta.isPresent()) {
            return pregunta.get();
        }

        throw new Exception("Pregunta no encontrada");
    }

    public Boolean isCorrectAnswer(Pregunta pregunta, Respuesta respuesta)
    {
        return  pregunta.getCorrectAnswers()
                .stream()
                .filter(ans -> ans.equals(respuesta))
                .findAny().isPresent();
    }

}


