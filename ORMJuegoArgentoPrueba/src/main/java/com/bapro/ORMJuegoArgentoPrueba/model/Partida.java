package com.bapro.ORMJuegoArgentoPrueba.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partidas")

public class Partida {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column
 private Integer id;

 

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "jugador_id")
private Jugador jugador;


	@Column
	private Integer vidas= 3;
	
	@Column
	private Integer puntos= 0;

public Partida() {
	
}

public Partida(Integer id, Jugador jugador) {
	
	this.id = id;
	this.jugador = jugador;
	
	
}

 




public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



public Jugador getJugador() {
	return jugador;
}

public void setJugador(Jugador jugador) {
	this.jugador = jugador;
}

public Integer getVidas() {
	return vidas;
}

public void setVidas(Integer vidas) {
	this.vidas = vidas;
}

public Integer getPuntos() {
	return puntos;
}

public void setPuntos(Integer puntos) {
	this.puntos = puntos;
}


public void acumularPuntos() {
	puntos= puntos + 5;
	
}
public void restarVidas() {
	vidas=vidas-1;
	
}


}
