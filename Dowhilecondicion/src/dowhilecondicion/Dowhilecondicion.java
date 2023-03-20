/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhilecondicion;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Dowhilecondicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int  numero;
       do{
           System.out.println("Capture un numero entre 0 y 999, El 0 Finaliza el "+ "Programa");
           numero=entrada.nextInt();
           if (numero == 0)
     
           {
             System.out.println("saliendo del propgrama ...");
          }
           else 
           {
            if (numero>=100)
           {
              System.out.println("Tiene tres digitos");
           }
            else{
                if (numero>=10)
                {
                    System.out.println("Tiene 2 digitos");
                }
                else 
                {
                    System.out.println("Tiene 1 digitos");
                }
            }
           }
       }while (numero!=0);
           
    } 
}
