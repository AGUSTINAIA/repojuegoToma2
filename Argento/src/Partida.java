import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Partida {

	private Jugador jugador;
	private List<Tema> temasDeLasPreguntas;

	public Partida(Jugador unJugador) {
		jugador = unJugador;
		this.temasDeLasPreguntas = new ArrayList<Tema>();

	}

	public Tema elergirTemaParaComenzaraJugar(ArrayList temasDeLasPreguntas) {

		for (int i = 0; i < temasDeLasPreguntas.size(); i++) {
		Tema elTema = temasDeLasPreguntas((int) Math.random() * temasDeLasPreguntas.size() + 1);
		}
		return elTema;

	}

	public void agregarTema(Tema unTema) {
		this.temasDeLasPreguntas.add(unTema);

	}

	public ArrayList<Tema> informarTemas() {
		// return temasDeLasPreguntas;
		/// for (int i=0; i<temasDeLasPreguntas.size(); i++) {
		// Tema unTema = temasDeLasPreguntas.get(i);
		return temasDeLasPreguntas;

	}

	public void seIniciaLaPartida(Jugador jugador) { // mientras q el jugador tenga vidas va a

		if (jugador.getVidas() >= 1) {
			// puede jugar
			// el jugador elige el tema
			//

		} else {
			System.out.println("Perdiste gato cua cua ");
		}

	}

	public void mostrarElPuntaje() {

	}
}
