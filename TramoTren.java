/**
 * 
 */
package trayectos;

/**
 * Esta clase representa un tramo de trayecto de tren
 * @author Claudia Saiz Escribano y Duna Puente Romera. 
 * @version 1.0
 * Nombre del fichero: TramoTren.java
 * 
 */ 
public class TramoTren extends TramoTrayecto {
	private Linea linea;
	private int numParadas;
	
	public TramoTren(String origen, String destino, Linea linea, int numParadas) {
		super(origen, destino);
		this.linea =linea;
		this.numParadas = numParadas;
	}
	
	@Override
	public String toString() {
		return "En tren de la línea "+this.linea+" "+super.toString();
	}
}
