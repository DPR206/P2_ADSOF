/**
 * Este paquete contiene las clases necesarias para la gestión de los trayectos a pie y a tren
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
	
  /**
   * Crea un nuevo TramoTren
   * 
   * @param origen origen del tramo
   * @param destino destino del tramo
   * @param linea linea de tren del trayecto
   * @param numParadas numero de paradas del tramo
   * @return nuevo TramoTren creado
   */
	public TramoTren(String origen, String destino, Linea linea, int numParadas) {
		super(origen, destino);
		this.linea =linea;
		this.numParadas = numParadas;
	}

  /**
   * Devuelve el tiempo en recorrer un trayecto en tren
   * 
   * @return double, tiempo en recorrer el trayecto
   */
  public double tiempo() {
    t = this.numParadas;
    
    switch (this.linea) {
      case C1:
        t *= 5;
        break;
      case C4:
        t *= 10;
        break;
      case C5:
        t *= 30;
        break;
      default:
    }
    
    return t;
  }
	
  /**
   * Devuelve la información del TramoTren en cadena de texto
   * 
   * @return String con la información
   */
	@Override
	public String toString() {
		return "En tren de la línea "+this.linea+" "+super.toString();
	}
}