package com.bapro.ORMJuegoArgentoPrueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Respuestas")
public class Respuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String unaRespuesta;
	
	@Column(nullable = false)
	private Boolean esCorrecta;
	
	@OneToOne
	@JoinColumn(name = "pregunta_id")
	private Pregunta pregunta;
	
	public Respuesta() {
		
	}

	public Respuesta(Integer id, String unaRespuesta, Boolean esCorrecta) {
		
		this.id = id;
		this.unaRespuesta = unaRespuesta;
		this.esCorrecta = esCorrecta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUnaRespuesta() {
		return unaRespuesta;
	}

	public void setUnaRespuesta(String unaRespuesta) {
		this.unaRespuesta = unaRespuesta;
	}

	public Boolean getEsCorrecta() {
		return esCorrecta;
	}

	public void setEsCorrecta(Boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}
	
		

}
