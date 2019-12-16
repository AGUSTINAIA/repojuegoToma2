import java.util.ArrayList;

public class AJugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador unJugador = new Jugador ("Ely", 0, 3);
		
		Tema temaUno = new Tema ("Geografia");
		Tema temaDos = new Tema ("Historia");
		Tema temaTres = new Tema ("Deportes");
		Tema temaCuatro = new Tema ("Interes General");
		Tema temaCinco = new Tema ("Ciencia y Tecnologia");
		Tema temaSeis = new Tema ("Biologia");
		
		
		
		Partida unaPartida= new Partida(unJugador);
		
		unaPartida.agregarTema(temaUno);
		unaPartida.agregarTema(temaDos);
		unaPartida.agregarTema(temaTres);
		unaPartida.agregarTema(temaCuatro);
		unaPartida.agregarTema(temaCinco);
		unaPartida.agregarTema(temaSeis);
		
		
		// PREGUNTAS
		
		Pregunta primerPregunta = new Pregunta ("¿en que año se estreno esperando la carroza?",20);
		
		Respuesta respuesta1 = new Respuesta ("1894", false);
		Respuesta respuesta2 = new Respuesta ("1985", true);
		Respuesta respuesta3 = new Respuesta ("1993", false);
		
		System.out.println(primerPregunta.mostrarRespuestas(opcionesRespuestas));
		
		
		/*primerPregunta.agregarRespuesta(respuesta1);
		primerPregunta.agregarRespuesta(respuesta2);
		primerPregunta.agregarRespuesta(respuesta3);*/
		
		
		
		
		
		
		
		
	//System.out.println(temaUno.getNombreTema());
		System.out.println(unaPartida.informarTemas());
	
		System.out.println(unaPartida.elergirTemaParaComenzaraJugar(temasDeLasPreguntas));
		
		
		System.out.println("El jugador "+ unJugador.getNombre() +" tiene "+ unJugador.getVidas() );
	}

	private static void add(Respuesta respuesta1) {
		// TODO Auto-generated method stub
		
	}

}
