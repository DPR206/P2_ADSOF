/**
 * Este paquete contiene las clases necesarias para la gestión de los trayectos a pie y a tren
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
	
  /**
   * Crea un nuevo TramoTrayecto
   * 
   * @param origen origen del trayecto
   * @param destino destino del trayecto
   * @return nuevo TramoTrayecto creado
   */
	public TramoTrayecto(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}
	
  /**
   * Devuelve el tiempo que se tarda en recorrer un trayecto
   * 
   * @return tiempo en recorrer un trayecto
   */
	public double tiempo() {
		return 0.0;
	}

  /**
   * Devuelve la información de un trayecto en cadena de texto
   * 
   * @return String con información de trayecto
   */
	@Override
	public String toString() {
		return "desde "+this.origen+" a "+this.destino+": "+this.tiempo()+" minutos";
	}
}
