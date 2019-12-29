import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tema {
private List<Pregunta> preguntasDelTema;
private String tema;

public Tema(String tema) {
	preguntasDelTema = new ArrayList <Pregunta> ();
	this.tema = tema;
}
public void agregarPregunta(Pregunta unaPregunta) {
	preguntasDelTema.add(unaPregunta);
}
public String getTema() {
	return tema;
}


public List<Pregunta> getPreguntasDelTema(){
	return  preguntasDelTema;
}

}
