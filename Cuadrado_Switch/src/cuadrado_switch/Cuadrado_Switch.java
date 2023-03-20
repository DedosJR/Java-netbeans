/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado_switch;

import java.util.Scanner;

/**
 *
 * @author Flores Israel
 */
public class Cuadrado_Switch {

    /**
     * El programa creado durante la clase para calcular el perimetro y superficie de un cuadrado agregar
     * el codigo correspondiente que permita tener: Un menu con las siguiente opciones
        Calcular perimetro
        Calcular superficie
        Salir
        El usuario puede calcular varias veces el perimetro o la superficie hasta que decida salir del programa eligiendo la opcion 3.
     */
    
    public static void main(String[] args) {
    
    int lado, opc;
    
    System.out.println("Menu Calcular Cuadrado \n");
 
   do {
    Scanner scn = new Scanner (System.in);
    
      System.out.println("Ingresa la Operacion a Realizar ");
       System.out.println("1. Calcular Perimetro");
        System.out.println("2. Calcular Superficie");
         System.out.println("3. Salir");
         System.out.println("\n");
          opc = scn.nextInt();
      
      switch(opc){
          
      case 1:
      
        System.out.println("Ingrese el valor lado ");
          lado = scn.nextInt();
           int perimetro;
            perimetro = lado*4;
             System.out.println("El perimetro es :  "+ perimetro + "\n");
     break;
    
         case 2: 
             System.out.println("Ingrese el valor lado");
               lado = scn.nextInt();
              int superficie;
              superficie = lado*2;
              System.out.println("La superficie  es : "+ superficie + "\n");
         break;
         case 3:
             opc =3;
          System.out.print("Saliendo...");
                break; 
                
          default: 
      System.out.println("Opcion incorrecta ingresa un numero que este en las opciones");
      break;
      
    } 
     
    }while (opc!=3); 
     }
}
 