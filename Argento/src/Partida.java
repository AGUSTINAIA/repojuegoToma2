import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Partida {
private List<Tema> listaDeTemas;
private Jugador jugador;


public Partida(Jugador unJugador) {
	this.listaDeTemas= new ArrayList <Tema>();
	this.jugador= unJugador;
	
}
public void agregarTemas(Tema unTema) {
	listaDeTemas.add(unTema);
}
List <Boolean> soluciones= new ArrayList <Boolean>();
public void jugar() {
	Random miAleatorioTema= new Random();
	Integer n= miAleatorioTema.nextInt(listaDeTemas.size());
	
	System.out.println("El tema con el que vas a jugar es: "+listaDeTemas.get(n).getTema());
	Tema elTema= listaDeTemas.get(n);
	Random miAleatorioPregunta= new Random();
	Integer p= miAleatorioPregunta.nextInt(elTema.getPreguntasDelTema().size());

	System.out.println(elTema.getPreguntasDelTema().get(p).getEnunciado());
	Pregunta laPregunta= elTema.getPreguntasDelTema().get(p);
	List<Respuesta> lasRespuestas= laPregunta.getLasOpciones();	
	
	List <String> opcionesRespuestas= new ArrayList <String> ();
	
	for (Integer i=0; i< lasRespuestas.size(); i++) {
		opcionesRespuestas.add(lasRespuestas.get(i).getUnaRespuesta());
		System.out.println((opcionesRespuestas.indexOf(lasRespuestas.get(i).getUnaRespuesta()) + 1) + " - " +   opcionesRespuestas.get(i));
		soluciones.add(lasRespuestas.get(i).getEsCorrecta());
		System.out.println(soluciones.get(i));
	}
	
	
}


public void elegirRespuesta(Integer numeroDeRespuesta, Jugador unJugador) {
	
	if(unJugador.getVidas()>0) {
	
	for(int i=0; i<soluciones.size();i++) {
	
	if(soluciones.get(numeroDeRespuesta -1)== true) {
		System.out.println("Respuesta correcta");
		unJugador.acumularPuntos();
		
		
		return;
	}else {
		
		System.out.println("Incorrecta");
		unJugador.restarVidas();
		
		
		return;
	}
	
}

}else {
System.out.println("No te quedan mas vidas");	
}
}




}
