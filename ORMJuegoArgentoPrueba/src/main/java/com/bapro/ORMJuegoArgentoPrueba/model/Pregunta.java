package com.bapro.ORMJuegoArgentoPrueba.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity (name="pregunta")
@Table(name = "preguntas")
public class Pregunta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@NotNull (message = "El campo pregunta no Puede estar vacio")
	@Size(min=2, message="Pregunta debe tener al menos dos letras")
	@Column
	private String enunciado;
	
	@NotNull(message= "Debe asignar un puntaje a la pregunta")
	@Size(min=0, max=20)
	@Column(nullable = false)
	private Integer puntaje;
	
	//@OneToMany(mappedBy = "pregunta" cascade = CascadeType.ALL, orphanRemoval =true)
	//private List<Respuesta> lasOpciones;
	
	
	
	
	@OneToOne
	@JoinColumn (name = "tema_id")
	private Tema tema;
	
	
	public Pregunta () {
	//  lasOpciones = new ArrayList<Respuesta>();
	}

	public Pregunta(Integer id, String enunciado, Integer puntaje) {
		
		this.id = id;
		this.enunciado = enunciado;
		this.puntaje = puntaje;
		
		
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


/* esto es lo que agrego JC
 
	void addRespuestas (Respuesta unaRespuesta) {
		this.lasOpciones.add(unaRespuesta);
		unaRespuesta.setPregunta(this);
	}

    public List<Respuesta> getRespuestas() {
        return this.lasOpciones;
    }

    public List<Respuesta> getCorrectAnswers() {
       return (List<Respuesta>) this.getRespuestas()
               .stream()
               .filter(Respuesta -> Respuesta.getCorrect().equals(true))
               .collect(Collectors.toList());
    }
	*/
	
	

	
	
}
