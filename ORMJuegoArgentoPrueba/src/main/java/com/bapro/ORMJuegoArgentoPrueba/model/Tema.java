package com.bapro.ORMJuegoArgentoPrueba.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Temas")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="tema")
	private List<Pregunta> preguntasDelTema;
	
	@Column(nullable = false)
	private String nombre;
	
	
	
	public Tema() {
		
	}
	
	

	public Tema(Integer id, String nombre ) {
		
		this.id = id;
		this.preguntasDelTema = new ArrayList <Pregunta> ();;
		this.nombre = nombre;
	
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Pregunta> getPreguntasDelTema() {
		return preguntasDelTema;
	}

	public void setPreguntasDelTema(List<Pregunta> preguntasDelTema) {
		this.preguntasDelTema = preguntasDelTema;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

	
	
}
