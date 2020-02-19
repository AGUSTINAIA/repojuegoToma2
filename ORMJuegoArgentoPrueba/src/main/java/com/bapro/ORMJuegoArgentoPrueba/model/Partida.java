package com.bapro.ORMJuegoArgentoPrueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partidas")
public class Partida {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
 private Integer id;
 
 private String tipoDePartida;
 //private List<Pregunta> arrayDePreguntas;
 private Integer puntos;
 
 @OneToOne
 @JoinColumn(name = "jugador_id")
 private Jugador unJugador;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getTipoDePartida() {
	return tipoDePartida;
}

public void setTipoDePartida(String tipoDePartida) {
	this.tipoDePartida = tipoDePartida;
}

public Integer getPuntos() {
	return puntos;
}

public void setPuntos(Integer puntos) {
	this.puntos = puntos;
}

public Jugador getUnJugador() {
	return unJugador;
}

public void setUnJugador(Jugador unJugador) {
	this.unJugador = unJugador;
}

public Partida() {
	
}

public Partida(Integer id, String tipoDePartida, Integer puntos, Jugador unJugador) {
	
	this.id = id;
	this.tipoDePartida = tipoDePartida;
	this.puntos = puntos;
	this.unJugador = unJugador;
}

 
}
