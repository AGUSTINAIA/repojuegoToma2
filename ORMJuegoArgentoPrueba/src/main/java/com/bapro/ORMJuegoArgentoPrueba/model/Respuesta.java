package com.bapro.ORMJuegoArgentoPrueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Respuestas")
public class Respuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message= "El campo respuesta no puede estar vacio")
	@Size(min= 2, message= "Respuesta debe tener al menos dos letras")
	@Column
	private String unaRespuesta;
	
	@Column(nullable = false)
	private Boolean esCorrecta;
	
	@ManyToOne
	@JoinColumn(name ="pregunta_id", nullable= false, updatable = false)
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
