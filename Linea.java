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
  C1("azul claro"),
  C4("azul oscuro"),
  C5("amarilla");

  private String color;

  /**
   * Crea una nueva línea
   * 
   * @param color color de la linea
   * @return nueva linea creada
   */
  private Linea(String color) {
    this.color = color;
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