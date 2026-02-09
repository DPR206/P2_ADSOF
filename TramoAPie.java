/**
 * Este paquete contiene las clases necesarias para la gestión de los trayectos a pie y a tren
 */
package trayectos;

/**
 * Esta clase representa un tramo de trayecto a pie
 * @author Claudia Saiz Escribano y Duna Puente Romera. 
 * @version 1.0
 * Nombre del fichero: TramoAPie.java
 * 
 */
public class TramoAPie extends TramoTrayecto {
	private double numKilómetros;
	private Ritmo ritmo;
	
	/**
	 * Crear un nuevo TramoAPie
	 * 
	 * @param origen origen del tramo
	 * @param destino destino del tramo
	 * @param numKilómetros número de kilómetros del tramo
	 * @param ritmo tipo de ritmo a seguir
	 */
	public TramoAPie (String origen, String destino, double numKilómetros, Ritmo ritmo) {
		super(origen, destino);
		this.numKilómetros = numKilómetros;
		this.ritmo = ritmo;
	}
	
	/**
	 * Crear un nuevo TramoAPie con ritmo por defecto (Moderado)
	 * 
	 * @param origen origen del tramo
	 * @param destino destino del tramo
	 * @param numKilómetros número de kilómetros del tramo
	 */
	public TramoAPie (String origen, String destino, double numKilómetros) {
		super(origen, destino);
		this.numKilómetros = numKilómetros;
		this.ritmo = Ritmo.MODERADO;
	}
	
	/**
	 * Devuelve el tiempo en recorrer un trayecto en tren
	 * 
	 * @return double, tiempo en recorrer el trayecto
	 */
	@Override
	public double tiempo() {
		double t = this.numKilómetros;
		
		switch(this.ritmo) {
		case SUAVE:
			t *= this.ritmo.getMinutos();
			break;
		case MODERADO:
			t *= this.ritmo.getMinutos();
			break;
		case RAPIDO:
			t *= this.ritmo.getMinutos();
			break;
		default:
			t = 0.0;
		}
		
		return t;	
	}
	
	/**
	 * Devuelve la información del TramoAPie en cadena de texto
	 * 
	 * @return String con la información
	 */
	@Override
	public String toString() {
		return "A pie "+super.toString()+this.ritmo;
	}
}
