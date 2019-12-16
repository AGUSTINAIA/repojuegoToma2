import java.util.ArrayList;
import java.util.List;

public class Pregunta {
	
	private String enunciado;
	private Integer puntos;
	private List<Respuesta>opcionesRespuestas;
	
	public Pregunta (String elEnunciado, Integer losPuntos) {
		enunciado= elEnunciado;
		puntos = losPuntos;
		this.opcionesRespuestas =new ArrayList<Respuesta>();
				
	}
	
	public void agregarRespuesta(Respuesta unaRespuesta) { //para programador
		this.opcionesRespuestas.add(unaRespuesta);

	}
		
	public String mostrarRespuestas(ArrayList respuestas) { //
		for (int i=0; i< opcionesRespuestas.size(); i++) {
			System.out.println(this.opcionesRespuestas.get(i).getTextoRespuesta());
		}
		
	}
	
	public Boolean seleccionarRespuesta(Integer numeroRespuesta) {
		if (numeroRespuesta == 1) {
			return respuesta1.correcta;
		}else if (numeroRespuesta == 2) {
			return respuesta2.correcta;
		}else if (numeroRespuesta == 3) {
			return respuesta3.correcta;
		}else if(numeroRespuesta == 4) {
			return respuesta4.correcta;
		}
		
	}
	
	
	public Integer elegirRespuesta (Integer posicionRespuesta) {
		
		if(this.opcionesRespuestas.(posicionRespuesta).correcta== true) {
			Jugador.puntos.set = puntos + 20;
			return puntos;
		}else { Jugador.vidas.set = vidas -1;
			System.out.println("No sumaste nada y perdiste una vida");
		}
		
	}
	


}
