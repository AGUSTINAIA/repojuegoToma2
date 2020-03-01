package com.bapro.ORMJuegoArgentoPrueba.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bapro.ORMJuegoArgentoPrueba.model.Respuesta;
import com.bapro.ORMJuegoArgentoPrueba.repository.RespuestaJpaRepositorio;

@Service
public class RespuestaService {

    private RespuestaJpaRepositorio respuestaJpaRepositorio;

    public RespuestaService (RespuestaJpaRepositorio respuestaJpaRepositorio)
    {
        this.respuestaJpaRepositorio = respuestaJpaRepositorio;
    }

    public Respuesta findById(Integer id) throws Exception {
        Optional<Respuesta> respuesta = this.respuestaJpaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            return respuesta.get();
        }

        throw new Exception("Respuesta not found");
    }
}

