import java.util.Scanner;

public class AJugar {

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
	
	Pregunta pregunta1= new Pregunta ("¿En que año fue la Revolucion de Mayo?", 5);
	Respuesta opcion1A = new Respuesta ("1801", false);
	Respuesta opcion1B = new Respuesta ("1810", true);
	Respuesta opcion1C = new Respuesta ("1816", false);
	
	
	pregunta1.agregarOpcion(opcion1A);
	pregunta1.agregarOpcion(opcion1B);
	pregunta1.agregarOpcion(opcion1C);
	
	
	
	Pregunta pregunta2= new Pregunta ("¿Cual es el segundo nombre del futbolista Diego Maradona?", 5);
	Respuesta opcion2A = new Respuesta ("Arnaldo", false);
	Respuesta opcion2B = new Respuesta ("Armando", true);
	Respuesta opcion2C = new Respuesta ("Ronaldo", false);
	
	
	pregunta2.agregarOpcion(opcion2A);
	pregunta2.agregarOpcion(opcion2B);
	pregunta2.agregarOpcion(opcion2C);
	
	Pregunta pregunta3= new Pregunta ("A quien pertenece la frase -Se te escapo la tortuga-", 5);
	Respuesta opcion3A = new Respuesta ("Mariano Grondona", false);
	Respuesta opcion3B = new Respuesta ("Susana Gimenez", false);
	Respuesta opcion3C = new Respuesta ("Diego Maradona", true);
	
	pregunta3.agregarOpcion(opcion3A);
	pregunta3.agregarOpcion(opcion3B);
	pregunta3.agregarOpcion(opcion3C);
	
	Pregunta pregunta4= new Pregunta ("cual de los siguientes musicos nunca formo parte de Los Abuelos de la Nada", 5);
	Respuesta opcion4A = new Respuesta ("Pappo", false);
	Respuesta opcion4B = new Respuesta ("Ciro Fogliatta", true);
	Respuesta opcion4C = new Respuesta ("Kubero Diaz", false);
	
	pregunta4.agregarOpcion(opcion4A);
	pregunta4.agregarOpcion(opcion4B);
	pregunta4.agregarOpcion(opcion4C);
	
	Pregunta pregunta5= new Pregunta ("El Aconcagua es el pico mas alto del pais, cual es el segundo?", 5);
	Respuesta opcion5A = new Respuesta ("Tupungato, Mendoza", false);
	Respuesta opcion5B = new Respuesta ("Montepissis, Catamarca/La Rioja", true);
	Respuesta opcion5C = new Respuesta ("Ojos del Salado, Tandil", false);
	
	pregunta5.agregarOpcion(opcion5A);
	pregunta5.agregarOpcion(opcion5B);
	pregunta5.agregarOpcion(opcion5C);
	
	
	Pregunta pregunta6= new Pregunta ("¿En que año el Dr. rene Favaloro realizo la primer cirugia de bypass aortocoronario?", 5);
	Respuesta opcion6A = new Respuesta ("1970", false);
	Respuesta opcion6B = new Respuesta ("1967", true);
	Respuesta opcion6C = new Respuesta ("1972", false);
	
	pregunta6.agregarOpcion(opcion6A);
	pregunta6.agregarOpcion(opcion6B);
	pregunta6.agregarOpcion(opcion6C);
	
	Pregunta pregunta7= new Pregunta ("¿Cuántas invasiones inglesas se produjeron en tiempos del Virreinato?", 5);
	Respuesta opcion7A = new Respuesta ("3", false);
	Respuesta opcion7B = new Respuesta ("2", true);
	Respuesta opcion7C = new Respuesta ("1", false);
	
	pregunta7.agregarOpcion(opcion7A);
	pregunta7.agregarOpcion(opcion7B);
	pregunta7.agregarOpcion(opcion7C);
	
	Pregunta pregunta8= new Pregunta ("¿Cómo se le llamó al proceso de independencia argentino?", 5);
	Respuesta opcion8A = new Respuesta ("Cordobazo", false);
	Respuesta opcion8B = new Respuesta ("Conquista del Desierto", false);
	Respuesta opcion8C = new Respuesta ("Revolucion de Mayo", true);
	
	pregunta8.agregarOpcion(opcion8A);
	pregunta8.agregarOpcion(opcion8B);
	pregunta8.agregarOpcion(opcion8C);
	
	Pregunta pregunta9= new Pregunta ("¿Que efectos tiene la cumbia?", 5);
	Respuesta opcion9A = new Respuesta ("silla", false);
	Respuesta opcion9B = new Respuesta ("mesita", true);
	Respuesta opcion9C = new Respuesta ("cajonera", false);
	
	pregunta9.agregarOpcion(opcion9A);
	pregunta9.agregarOpcion(opcion9B);
	pregunta9.agregarOpcion(opcion9C);
	
	Pregunta pregunta10= new Pregunta ("¿Qué es lo que no se mancha?", 5);
	Respuesta opcion10A = new Respuesta ("la camiseta", true);
	Respuesta opcion10B = new Respuesta ("las medias", false);
	Respuesta opcion10C = new Respuesta ("los pantalones", false);
	
	pregunta10.agregarOpcion(opcion10A);
	pregunta10.agregarOpcion(opcion10B);
	pregunta10.agregarOpcion(opcion10C);
	
	Pregunta pregunta11= new Pregunta ("¿Qué jugadora de hockey sobre césped ha ganado 7 veces el premio a la mejor jugadora del mundo de 2013?", 5);
	Respuesta opcion11A = new Respuesta ("Belen Succi", false);
	Respuesta opcion11B = new Respuesta ("Maria Cecilia Rognoni", false);
	Respuesta opcion11C = new Respuesta ("Luciana Aymar", true);
	
	pregunta11.agregarOpcion(opcion11A);
	pregunta11.agregarOpcion(opcion11B);
	pregunta11.agregarOpcion(opcion11C);

	Pregunta pregunta12= new Pregunta ("¿Cuántas finales del mundo jugó la Selección Argentina de fútbol?", 5);
	Respuesta opcion12A = new Respuesta ("5", false);
	Respuesta opcion12B = new Respuesta ("7", false);
	Respuesta opcion12C = new Respuesta ("4", true);
	
	pregunta12.agregarOpcion(opcion12A);
	pregunta12.agregarOpcion(opcion12B);
	pregunta12.agregarOpcion(opcion12C);
	
	Pregunta pregunta13= new Pregunta ("El tango surgió en la zona del Río de la Plata alrededor de la década de...", 5);
	Respuesta opcion13A = new Respuesta ("1880", true);
	Respuesta opcion13B = new Respuesta ("1914", false);
	Respuesta opcion13C = new Respuesta ("1893", false);
	
	pregunta13.agregarOpcion(opcion13A);
	pregunta13.agregarOpcion(opcion13B);
	pregunta13.agregarOpcion(opcion13C);
	
	Pregunta pregunta14= new Pregunta ("¿De qué región es caracteristico el chamame?", 5);
	Respuesta opcion14A = new Respuesta ("Noroeste", false);
	Respuesta opcion14B = new Respuesta ("Litoral", true);
	Respuesta opcion14C = new Respuesta ("Patagonica", false);
	
	pregunta14.agregarOpcion(opcion14A);
	pregunta14.agregarOpcion(opcion14B);
	pregunta14.agregarOpcion(opcion14C);
	
	Pregunta pregunta15= new Pregunta ("¿En qué provincia se encuentra el lago Traful?", 5);
	Respuesta opcion15A = new Respuesta ("Neuquen", true);
	Respuesta opcion15B = new Respuesta ("Rio Negro", false);
	Respuesta opcion15C = new Respuesta ("Santa Cruz", false);
	
	pregunta15.agregarOpcion(opcion15A);
	pregunta15.agregarOpcion(opcion15B);
	pregunta15.agregarOpcion(opcion15C);
	
	Pregunta pregunta16= new Pregunta ("¿Cuál de estos rios es mas extensos?", 5);
	Respuesta opcion16A = new Respuesta ("Paraná", false);
	Respuesta opcion16B = new Respuesta ("Bermejo", false);
	Respuesta opcion16C = new Respuesta ("Salado Norte", true);
	
	pregunta16.agregarOpcion(opcion16A);
	pregunta16.agregarOpcion(opcion16B);
	pregunta16.agregarOpcion(opcion16C);
	
	Pregunta pregunta17= new Pregunta ("¿Qué premio novel ganó Luis Federico Leloir?", 5);
	Respuesta opcion17A = new Respuesta ("Literatura", false);
	Respuesta opcion17B = new Respuesta ("Medicina", false);
	Respuesta opcion17C = new Respuesta ("Quimica", true);
	
	pregunta17.agregarOpcion(opcion17A);
	pregunta17.agregarOpcion(opcion17B);
	pregunta17.agregarOpcion(opcion17C);
	
	Pregunta pregunta18= new Pregunta ("El instituto Balseiro es una unidad académica que se dedica a...", 5);
	Respuesta opcion18A = new Respuesta ("Realizar investigaciones sobre el cancer", false);
	Respuesta opcion18B = new Respuesta ("Forma profesionales en Física e Ingeniería Nuclear", true);
	Respuesta opcion18C = new Respuesta ("Forma profesionales en Quimica y Bioquimica y ciencias Biologicas ", false);
	
	pregunta18.agregarOpcion(opcion18A);
	pregunta18.agregarOpcion(opcion18B);
	pregunta18.agregarOpcion(opcion18C);
	
	historia.agregarPregunta(pregunta1);
	historia.agregarPregunta(pregunta7);
	historia.agregarPregunta(pregunta8);
	culturaGeneral.agregarPregunta(pregunta3);
	culturaGeneral.agregarPregunta(pregunta9);
	culturaGeneral.agregarPregunta(pregunta10);
	deportes.agregarPregunta(pregunta2);
	deportes.agregarPregunta(pregunta11);
	deportes.agregarPregunta(pregunta12);
	música.agregarPregunta(pregunta4);
	música.agregarPregunta(pregunta13);
	música.agregarPregunta(pregunta14);
	geografia.agregarPregunta(pregunta5);
	geografia.agregarPregunta(pregunta15);
	geografia.agregarPregunta(pregunta16);
	cienciaYTecnologia.agregarPregunta(pregunta6);
	cienciaYTecnologia.agregarPregunta(pregunta17);
	cienciaYTecnologia.agregarPregunta(pregunta18);
	
	juego1.agregarTemas(culturaGeneral);
	juego1.agregarTemas(música);
	juego1.agregarTemas(historia);
	juego1.agregarTemas(geografia);
	juego1.agregarTemas(cienciaYTecnologia);
	juego1.agregarTemas(deportes);

	
	
	juego1.jugar(player1);
	juego1.elegirRespuesta(3, player1);
	juego1.queTanArgentoSoy(player1); 
	
	/*juego1.jugar(player1);
	juego1.elegirRespuesta(2, player1);
	juego1.jugar(player1);
	juego1.elegirRespuesta(1, player1);
	juego1.jugar(player1);
	juego1.elegirRespuesta(2, player1);
	juego1.jugar(player1);
	juego1.elegirRespuesta(3, player1);
	juego1.jugar(player1);
	juego1.elegirRespuesta(2, player1);
	juego1.jugar(player1);
	juego1.elegirRespuesta(1, player1);
	juego1.jugar(player1);
	juego1.elegirRespuesta(1, player1);
	
	
/*	//while
	Integer respuestaEnNUmero = 1;
	
	while(respuestaEnNUmero!=2){
		//esto es para que el usuario pueda elegir una opcion
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Ingresa una opcion");
		String respuesta = sc.nextLine();
		 respuestaEnNUmero = Integer.parseInt(respuesta);
		System.out.println(respuesta);
		juego1.elegirRespuesta(respuestaEnNUmero, player1);
		
	}*/
	
	
	
	
	
	
	
	}

}
