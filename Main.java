/**
 * Este paquete contiene las clases necesarias para la gestión de los trayectos a pie y a tren
 */
package trayectos;

/**
 * Esta clase prueba las funcionalidades de las clases TramoTrayecto, TramoTren, TramoAPie, y Linea
 * @author Claudia Saiz Escribano y Duna Puente Romera. 
 * @version 1.0
 * Nombre del fichero: Main.java
 */
public class Main {

  /**
   * Punto de entrada de la aplicación
   * 
   * @param args Argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    TramoTrayecto[] trayecto = {
      new TramoAPie ("Hotel Puerta del Sol", "Sol Renfe", 1),
      new TramoTren ("Sol Renfe", "Cantoblanco Renfe", Linea.C4, 4),
      new TramoAPie ("Cantoblanco Renfe", "EPS", 2.6, Ritmo.RAPIDO),
    };

    for (TramoTrayecto tramo : trayecto)
      System.out.println(tramo);
  }
}