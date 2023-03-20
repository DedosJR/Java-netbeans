/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3calificaciones;

import java.util.Scanner;

/**
 * Se desea calcular el promedio de un alumno a partir de la calificacion de tres examenes.
 * Se debe considerar que las dos primeras calificaciones tienen una ponderación
 * del 25 % de la caificacion final, mientras que la ultima es del 50%. 
 *Programa para calcular promedio de calificaciones 
 * calificacion 1 valor 25%
 * calificacion 2 valor 25%
 * calificacion 3 valor 50%
 * @author Flores Israel 
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //variables 
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double prom;
        double resultado;
        
        
        //Solicitud de datos
    System.out.println("Ingresa la priemra calificacion");
    calificacion1 = entrada.nextDouble ();
    
       System.out.println("Ingresa la Segunda calificacion");
       calificacion2 = entrada.nextDouble();
       
          System.out.println("Ingresa Tercera calificacion");
          calificacion3 = entrada.nextDouble();
        
          //operacion para calcular promedio 
         resultado = calificacion1 * 0.25 + calificacion2 * 0.25 + calificacion3 * 0.50;
  
         //valores de promedio
              prom = resultado;

                //Mensaje de calificacion Final =)
                 System.out.printf("Tu calificacion Final Es: " + prom);
  
  
    }
    
}
