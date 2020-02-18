package com.bapro.ORMJuegoArgentoPrueba.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Temas")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	

	//private List<Pregunta> preguntasDelTema;
	
	@Column(nullable = false)
	private String tema;
	
	@Column(nullable = false)
	private String descripcion;
	
	public Tema() {
		
	}
	
	public Tema(String tema) {
	//	preguntasDelTema = new ArrayList <Pregunta> ();
		this.tema = tema;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public List<Pregunta> getPreguntasDelTema() {
	//	return preguntasDelTema;
//	}

//	public void setPreguntasDelTema(List<Pregunta> preguntasDelTema) {
//		this.preguntasDelTema = preguntasDelTema;
//	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	
	
}
