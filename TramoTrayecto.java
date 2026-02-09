/**
 * 
 */
package trayectos;

/**
 * Esta clase representa un tramo de trayecto
 * @author Claudia Saiz Escribano y Duna Puente Romera. 
 * @version 1.0
 * Nombre del fichero: TramoTrayecto.java
 * 
 */ 
public abstract class TramoTrayecto {
	private String origen;
	private String destino;
	
	public TramoTrayecto(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}
	
	public double tiempo() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "desde "+this.origen+" a "+this.destino+": "+this.tiempo()+" minutos";
	}
}

