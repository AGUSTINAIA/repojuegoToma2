
public class Jugador {
private String nombre;
private String apodo;
private Integer puntosPartida = 0;
private Integer vidas= 3;
private Integer respuestasCorrectas= 0;

public Jugador (String unNombre, String unApodo) {
	this.nombre= unNombre;
	this.apodo= unApodo;
}
public String getNombre() {
	return nombre;
}

public Integer getRespuestasCorrectas() {
	return respuestasCorrectas;
}
public String getApodo() {
	return apodo;
}
public Integer getPuntos() {
	return puntosPartida;
}
public Integer getVidas() {
	return vidas;
}
public void acumularPuntos() {
	puntosPartida= puntosPartida+5;
	System.out.println("ahora tenes: "+ puntosPartida + " puntos");
}
public void restarVidas() {
	vidas=vidas-1;
	System.out.println("te quedan: "+ vidas + " vidas");
}

public void acumularCorrectas() {
	respuestasCorrectas= respuestasCorrectas +1;
	System.out.println("Genial, ya tenes "+ respuestasCorrectas + " respuestas correctas");
}
 
}
