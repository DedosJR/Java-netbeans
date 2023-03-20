/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch1;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
   int opcion;
   
   
        System.out.print("Capture su mes de nacimiento con formato mm ");
          opcion=entrada.nextInt();
          
          
    switch (opcion) {
       case 1:
          System.out.println("Tu mes de nacimiento es Enero");
          break;
        case 2:
           System.out.println("Tu mes de nacimiento es Febrero");
            break;
        case 3:
          System.out.println("Tu mes de nacimiento es Marzo");
          break;
        case 4:
          System.out.println("Tu mes de nacimiento es Abril");
          break;
        case 5:
           System.out.println("Tu mes de nacimiento es Mayo");
            break;
        case 6:
          System.out.println("Tu mes de nacimiento es Junio");
          break;
        case 7:
           System.out.println("Tu mes de nacimiento es Julio");
           break;
        case 8:
           System.out.println("Tu mes de nacimiento es Agosto");
            break;
        case 9:
           System.out.println("Tu mes de nacimiento es Septiembre");
           break;
       case 10:
          System.out.println("Tu mes de nacimiento es Octubre");
          break;
       case 11:
          System.out.println("Tu mes de nacimiento es Noviembre");
          break;
       case 12:
          System.out.println("Tu mes de nacimiento es Diciembre");
          break;
      }
   }
 }

