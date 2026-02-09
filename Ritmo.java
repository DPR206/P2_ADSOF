/**
 * 
 */
package trayectos;

/**
 * Esta enumeración representa el ritmo
 * @author Claudia Saiz Escribano y Duna Puente Romera. 
 * @version 1.0
 * Nombre del fichero: Ritmo.java
 * 
 */
public enum Ritmo {
	SUAVE(15),
	MODERADO(10),
	RAPIDO(8);
	
	private int minutos;
	
	private Ritmo(int minutos) {
		this.minutos = minutos;
	}
	
	public String toString() {
		return " (ritmo "+this.name()+")";
	}
}
