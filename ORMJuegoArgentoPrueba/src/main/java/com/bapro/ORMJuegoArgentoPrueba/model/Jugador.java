package com.bapro.ORMJuegoArgentoPrueba.model;

import java.util.List;

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
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "jugadores")
public class Jugador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message= "Este campo no puede estar vacio")
	@Size (min=2, max=20, message= "Debe tener entre 2 y 20 letras")
	@Column(nullable = false)
	private String nombre;
	
	@NotBlank(message="Este campo no puede estar vacio")
	@Size (min=2, max=20, message= "Debe tener entre 2 y 20 letras")
	@Column(nullable = false)
	private String apellido;
	
	@Email
	@Column(nullable = false, unique = true)
	
	private String email;
	
	@NotBlank(message="Este campo no puede estar vacio")
	@Size (min=2, max=20, message= "Debe tener entre 2 y 20 letras")
	@Column(nullable = false, unique = true)
	private String apodo;
	
	@Column(nullable = false)
	private String provincia;
	
	@Column
	@NotBlank(message= "Este campo no puede estar vacio")
	@Size (min=2, max=8, message= "Debe tener entre 2 y 8 caracteres")
	private String contraseña;
	
	@Column
	@NotBlank(message="Este campo no puede estar vacio" )
	@Size (min=2, max=20, message= "Debe tener entre 2 y 20 letras")
	private String ciudad;
	
	@Column
	@NotBlank(message= "Este campo no puede estar vacio")
	@Size (min=2, max=8, message= "Debe tener entre 2 y 8 caracteres")
	private String contraseña2;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="jugador")
	private List<Partida> listaDePartidas;
	

	
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
		this.listaDePartidas= listaDePartidas;
		
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

	public List<Partida> getListaDePartidas() {
		return listaDePartidas;
	}

	public void setListaDePartidas(List<Partida> listaDePartidas) {
		this.listaDePartidas = listaDePartidas;
	}

	
	


	
	
}
