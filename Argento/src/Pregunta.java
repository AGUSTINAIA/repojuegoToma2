import java.util.ArrayList;
import java.util.List;

public class Pregunta {

	private String enunciado;
	private Integer puntos;
	private List<Respuesta> lasOpciones;
	
	
	public Pregunta (String elEnunciado, Integer losPuntos) {
		this.enunciado= elEnunciado;
		this.puntos= losPuntos;
		this.lasOpciones= new ArrayList<Respuesta>();
	}
	

	
	public String getEnunciado() {
	
		return enunciado;
		
	}
	
	public Integer getPuntos() {
		return puntos;
	}
	
	public List<Respuesta> getLasOpciones(){
		return  lasOpciones;
	}

	public void  agregarOpcion(Respuesta unaRespuesta) {
		lasOpciones.add(unaRespuesta);
	}
	


	}
	
	
	

