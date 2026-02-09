/**
 * 
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
	
	
	public TramoAPie (String origen, String destino, double numKilómetros, Ritmo ritmo) {
		super(origen, destino);
		this.numKilómetros = numKilómetros;
		this.ritmo = ritmo;
	}
	
	public TramoAPie (String origen, String destino, double numKilómetros) {
		super(origen, destino);
		this.numKilómetros = numKilómetros;
		this.ritmo = Ritmo.MODERADO;
	}
	
	@Override
	public String toString() {
		return "A pie "+super.toString()+this.ritmo;
	}
}
