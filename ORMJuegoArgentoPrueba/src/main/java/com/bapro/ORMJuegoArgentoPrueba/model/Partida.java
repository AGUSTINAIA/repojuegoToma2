package com.bapro.ORMJuegoArgentoPrueba.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
 


//no se si vamos a almacenar las preguntas de la partida. creo que no es necesario
//@OneToMany(fetch=FetchType.LAZY, mappedBy="unaPregunta")
// private List<Pregunta> arrayDePreguntas;


 
 @OneToOne
 @JoinColumn(name = "jugador_id")
 private Jugador unJugador;

 

public Partida() {
	
}

public Partida(Integer id, String tipoDePartida, Integer puntos, Jugador unJugador) {
	
	this.id = id;

	this.unJugador = unJugador;
	//this.arrayDePreguntas= new ArrayList<Pregunta>();
}

 


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



public Jugador getUnJugador() {
	return unJugador;
}

public void setUnJugador(Jugador unJugador) {
	this.unJugador = unJugador;
}

//public List<Pregunta> getArrayDePreguntas() {
//	return arrayDePreguntas;
//}
//
//public void setArrayDePreguntas(List<Pregunta> arrayDePreguntas) {
//	this.arrayDePreguntas = arrayDePreguntas;
//}

}
