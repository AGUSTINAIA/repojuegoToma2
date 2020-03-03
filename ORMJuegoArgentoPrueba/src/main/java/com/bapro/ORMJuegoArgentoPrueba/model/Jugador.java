package com.bapro.ORMJuegoArgentoPrueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "jugadores")
public class Jugador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message= "Este campo no puede estar vacio")
	@Size (min=2, max=20, message= "Nombre invalido, debe tener entre 2 y 20  letras")
	@Column(nullable = false)
	private String nombre;
	
	@NotNull(message= "Apellido invalido, debe tener entre 2 y 20  letras")
	@Size (min=2, max=20)
	@Column(nullable = false)
	private String apellido;
	
	@Email
	@Column(nullable = false, unique = true)
	//@Pattern (regexp = ahi va la expresion regular)
	private String email;
	
	@NotNull(message= "Apodo invalido, debe tener entre 2 y 20  letras")
	@Size (min=2, max=20)
	@Column(nullable = false, unique = true)
	private String apodo;
	
	@Column(nullable = false)
	private String provincia;
	
	@Column
	@NotNull(message= "Nombre invalido, debe tener entre 2 y 20  letras")
	@Size (min=2, max=20)
	private String contraseña;
	
	
	@NotNull(message= "Campo invalido, debe tener por lo menos 3 caracteres")
	@Size (min=2, max= 20)
	private String ciudad;
	
	@Column
	@NotNull(message= "Nombre invalido, debe tener entre 2 y 20  letras")
	@Size (min=2, max=20)
	private String contraseña2;

	@Column
	private Integer vidas=3;
	
	@Column
	private Integer puntos=0;
	
	
	public Jugador() {
		
	}
	
	public Jugador(Integer id, String nombre, String apellido, String email, String apodo, String provincia,
			String ciudad, String contraseña, String contraseña2) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.apodo = apodo;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.contraseña = contraseña;
		this.contraseña2 = contraseña2;
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String getContraseña2() {
		return contraseña;
	}

	public void setContraseña2(String contraseña2) {
		this.contraseña2 = contraseña2;
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
	


	
	
}
