package com.bapro.ORMJuegoArgentoPrueba.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "preguntas")
public class Pregunta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false,length = 255 )
	private String enunciado;
	
	@Column(nullable = false)
	private Integer puntaje;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Respuesta> lasOpciones;
	
	@OneToOne
	@JoinColumn (name = "tema_id")
	private Tema tema;
	
	
	
	
	public Pregunta () {
		
	}

	public Pregunta(Integer id, String enunciado, Integer puntaje) {
		
		this.id = id;
		this.enunciado = enunciado;
		this.puntaje = puntaje;
		
		lasOpciones= new ArrayList<Respuesta>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public List<Respuesta> getLasOpciones() {
		return lasOpciones;
	}

	public void setLasOpciones(List<Respuesta> lasOpciones) {
		this.lasOpciones = lasOpciones;
	}


	
	
	

	
	
}
