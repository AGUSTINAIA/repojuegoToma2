import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Partida {
	private List<Tema> listaDeTemas;
	private List <Jugador> listaDeJugadores;

	public Partida() {
		this.listaDeTemas = new ArrayList<Tema>();
		this.listaDeJugadores = new ArrayList<Jugador>();

	}

	public void agregarTemas(Tema unTema) {
		listaDeTemas.add(unTema);
	}
	public void agregarJugadores(Jugador unJugador) {
		listaDeJugadores.add(unJugador);
	}

	List<Boolean> soluciones = new ArrayList<Boolean>();
	
	
	public Jugador buscarJugador(String apodo) {
		Jugador jugadorBuscado = null;
		for(int i=0; i<listaDeJugadores.size(); i++) {
			Jugador jugadorActual= listaDeJugadores.get(i);
			if(jugadorActual.getApodo().equals(apodo)) {
				jugadorBuscado= jugadorActual;
				break;
			}
				
			}return jugadorBuscado;
	}
	
	
	public void jugar(String apodo) {
		Jugador jugadorPartida= buscarJugador(apodo);
		if (jugadorPartida.getVidas() > 0) {
			Random miAleatorioTema = new Random();
			Integer n = miAleatorioTema.nextInt(listaDeTemas.size());
			System.out.println("El tema con el que vas a jugar es: " + listaDeTemas.get(n).getTema());
			Tema elTema = listaDeTemas.get(n);

			Random miAleatorioPregunta = new Random();
			Integer p = miAleatorioPregunta.nextInt(elTema.getPreguntasDelTema().size());
			System.out.println(elTema.getPreguntasDelTema().get(p).getEnunciado());
			Pregunta laPregunta = elTema.getPreguntasDelTema().get(p);
			
			elTema.sacarPregunta(laPregunta);

			List<Respuesta> lasRespuestas = laPregunta.getLasOpciones();

			List<String> opcionesRespuestas = new ArrayList<String>();

			for (Integer i = 0; i < lasRespuestas.size(); i++) {
				opcionesRespuestas.add(lasRespuestas.get(i).getUnaRespuesta());
				System.out.println((opcionesRespuestas.indexOf(lasRespuestas.get(i).getUnaRespuesta()) + 1) + " - "
						+ opcionesRespuestas.get(i));
				soluciones.add(lasRespuestas.get(i).getEsCorrecta());
				// System.out.println(soluciones.get(i));

			}
		} else {
			System.out.println("No podes jugar mas, inicia otra partida");
		}

	}
	

	

	public void elegirRespuesta(Integer numeroDeRespuesta, String apodo) {
		Jugador jugadorPartida= buscarJugador(apodo);
		if (jugadorPartida.getVidas() > 0) {

			for (int i = 0; i < soluciones.size(); i++) {

				if (soluciones.get(numeroDeRespuesta - 1) == true) {
					System.out.println("Respuesta correcta");
					jugadorPartida.acumularPuntos();
					jugadorPartida.acumularCorrectas();
					
					break;
				} else {

					System.out.println("Incorrecta");
					jugadorPartida.restarVidas();

					break;
				}

			}

		} else {
			System.out.println("No te quedan mas vidas");
			Integer puntajeFinal = jugadorPartida.getPuntos();
			System.out.println("tus puntos son: "+ puntajeFinal);
		}
	}
/*	
public void queTanArgentoSoy(String apodo) {
	Jugador jugadorPartida= buscarJugador(apodo);
		if (jugadorPartida.getVidas() == 3) {
			System.out.println("Felicitaciones!! Ud es 100% Argento");
		} else {
			Integer totalPreguntas = 0;
			Integer porcentajeAcierto = 0;
			for (int i = 0; i < listaDeTemas.size(); i++) {
				totalPreguntas = totalPreguntas + (listaDeTemas.get(i).cantidadPreguntasPorTema());
				return;
				
				
			} 	
						
			porcentajeAcierto = ((contadorRetasCorrectas *100)/ totalPreguntas);
			System.out.println("Sos " + porcentajeAcierto + "% Argento" );
			
		} 
	}*/

	
	public void queTanArgentoSoy(String apodo) {
		Jugador jugadorPartida= buscarJugador(apodo);
		Integer cantidadDePreguntas = 0;			
		for(int i=0; i < listaDeTemas.size(); i++) {
			Integer preguntasPorTema= listaDeTemas.get(i).cantidadPreguntasPorTema();
			cantidadDePreguntas = cantidadDePreguntas + preguntasPorTema;
		}
		
		System.out.println("Sos "+ ((jugadorPartida.getRespuestasCorrectas()*100)/cantidadDePreguntas)+ " % argento") ;
	
	}
	

}
