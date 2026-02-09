/**
 * Este paquete contiene las clases necesarias para la gestión de los trayectos a pie y a tren
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
	
	private double minutos;
	
	/**
	 * Crea un nuevo tipo de ritmo
	 * 
	 * @param minutos cantidad de minutos que se tarda en recorrer un kilómetro
	 */
	private Ritmo(int minutos) {
		this.minutos = minutos;
	}
	
	/**
	 * Devuelve el número de minutos del tipo de ritmo
	 * @return double tiempo en minutos que se tarda en recorrer un kilómetro
	 */
	public double getMinutos() {
		return this.minutos;
	}
	
	/**
	 * Devuelve la información del ritmo como cadena de texto
	 * 
	 * @return String con información del ritmo
	 */
	public String toString() {
		return " (ritmo "+this.name()+")";
	}
}
