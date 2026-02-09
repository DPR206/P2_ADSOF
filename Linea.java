/**
 * Este paquete contiene las clases necesarias para la gestión de los trayectos a pie y a tren
 */
package trayectos;

/**
 * Esta clase es una enumeración de líneas de tren
 * @author Claudia Saiz Escribano y Duna Puente Romera. 
 * @version 1.0
 * Nombre del fichero: Linea.java
 */
public enum Linea{
  C1("azul claro", 5),
  C4("azul oscuro", 10),
  C5("amarilla", 30);

  private String color;
  private int tiempoEspera;

  /**
   * Crea una nueva línea
   * 
   * @param color color de la linea
   * @param tiempoEspera tiempo de espera entre paradas
   * @return nueva linea creada
   */
  private Linea(String color, int tiempoEspera) {
    this.color = color;
    this.tiempoEspera = tiempoEspera;
  }

  /**
   * Devuelve la información de la linea como cadena de texto
   * 
   * @return String con información de la linea
   */
  @Override
  private String toString() {
    return this.name() + " (" + this.color + ") ";
  }

}
