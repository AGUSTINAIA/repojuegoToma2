

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Tema culturaGeneral= new Tema ("Cultura General");
	Tema música= new Tema ("Música");
	Tema historia= new Tema ("Historia");
	Tema geografia= new Tema ("Geografia");
	Tema cienciaYTecnologia= new Tema ("Ciencia y tecnologia");
	Tema deportes= new Tema ("Deportes");
	
	Jugador player1= new Jugador("estefi", "estefigaray12");
	Partida juego1= new Partida(player1);
	
	Pregunta primerPregunta= new Pregunta ("¿En que año fue la Revolucion de Mayo?", 5);
	Respuesta opcionA = new Respuesta ("1801", false);
	Respuesta opcionB = new Respuesta ("1810", true);
	Respuesta opcionC = new Respuesta ("1816", false);
	
	
	primerPregunta.agregarOpcion(opcionA);
	primerPregunta.agregarOpcion(opcionB);
	primerPregunta.agregarOpcion(opcionC);
	
	
	
	Pregunta segundaPregunta= new Pregunta ("¿Cual es el segundo nombre del futbolista Diego Maradona?", 5);
	Respuesta opcionAA = new Respuesta ("Arnaldo", false);
	Respuesta opcionBB = new Respuesta ("Armando", true);
	Respuesta opcionCC = new Respuesta ("Ronaldo", false);
	
	segundaPregunta.agregarOpcion(opcionAA);
	segundaPregunta.agregarOpcion(opcionBB);
	segundaPregunta.agregarOpcion(opcionCC);
	
	Pregunta terceraPregunta= new Pregunta ("A quien pertenece la frase -Se te escapo la tortuga-", 5);
	Respuesta opcionAAA = new Respuesta ("Mariano Grondona", false);
	Respuesta opcionBBB = new Respuesta ("Susana Gimenez", false);
	Respuesta opcionCCC = new Respuesta ("Diego Maradona", true);
	
	terceraPregunta.agregarOpcion(opcionAAA);
	terceraPregunta.agregarOpcion(opcionBBB);
	terceraPregunta.agregarOpcion(opcionCCC);
	
	Pregunta cuartaPregunta= new Pregunta ("cual de los siguientes musicos nunca formo parte de Los Abuelos de la Nada", 5);
	Respuesta opcionAAAA = new Respuesta ("Pappo", false);
	Respuesta opcionBBBB = new Respuesta ("Ciro Fogliatta", true);
	Respuesta opcionCCCC = new Respuesta ("Kubero Diaz", false);
	
	cuartaPregunta.agregarOpcion(opcionAAAA);
	cuartaPregunta.agregarOpcion(opcionBBBB);
	cuartaPregunta.agregarOpcion(opcionCCCC);
	
	Pregunta quintaPregunta= new Pregunta ("El Aconcagua es el pico mas alto del pais, cual es el segundo?", 5);
	Respuesta opcionAAAAA = new Respuesta ("Tupungato, Mendoza", false);
	Respuesta opcionBBBBB = new Respuesta ("Montepissis, Catamarca/La Rioja", true);
	Respuesta opcionCCCCC = new Respuesta ("Ojos del Salado, Tandil", false);
	
	quintaPregunta.agregarOpcion(opcionAAAAA);
	quintaPregunta.agregarOpcion(opcionBBBBB);
	quintaPregunta.agregarOpcion(opcionCCCCC);
	
	
	Pregunta sextaPregunta= new Pregunta ("¿En que año el Dr. rene Favaloro realizo la primer cirugia de bypass aortocoronario?", 5);
	Respuesta opcionAAAAAA = new Respuesta ("1970", false);
	Respuesta opcionBBBBBB = new Respuesta ("1967", true);
	Respuesta opcionCCCCCC = new Respuesta ("1972", false);
	
	sextaPregunta.agregarOpcion(opcionAAAAAA);
	sextaPregunta.agregarOpcion(opcionBBBBBB);
	sextaPregunta.agregarOpcion(opcionCCCCCC);
	
	
	historia.agregarPregunta(primerPregunta);
	culturaGeneral.agregarPregunta(terceraPregunta);
	deportes.agregarPregunta(segundaPregunta);
	música.agregarPregunta(cuartaPregunta);
	geografia.agregarPregunta(quintaPregunta);
	cienciaYTecnologia.agregarPregunta(sextaPregunta);
	
	
	juego1.agregarTemas(culturaGeneral);
	juego1.agregarTemas(música);
	juego1.agregarTemas(historia);
	juego1.agregarTemas(geografia);
	juego1.agregarTemas(cienciaYTecnologia);
	juego1.agregarTemas(deportes);

	
	
	juego1.jugar();
	juego1.elegirRespuesta(1, player1);
	
	
	
	
	
	
	}

}
