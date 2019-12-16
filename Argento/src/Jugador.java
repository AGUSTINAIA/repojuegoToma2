
public class Jugador {
	
	private String nombre;
//  private String apellido;
//	private String usuario;
// 	private String email;
// 	private String provincia;
// 	private String ciudad;
	private Integer puntos;
	private Integer vidas;
	
	
	public Jugador (String unNombre, Integer susPuntos, Integer susVidas) {
		nombre=unNombre;
		puntos = susPuntos;
		vidas = susVidas;
			
	}
	
	public Integer getVidas() {
		return vidas;
	}
	
	public Integer setVidas() {
		return vidas;
	}
	
	public Integer getPuntos() {
		return puntos;
	}
	
	public Integer setPuntos() {
		return puntos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void jugar() {
		
	}
}
