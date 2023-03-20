/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacion;
import java.util.Scanner;

/**
 *
 * @author dedosjr
 */
public class Calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
   int cal;
   
   
   System.out.print ("Captura la calificacion");
   cal = entrada.nextInt();
   
   
   
   if(cal >=7)
            System.out.printf("La calificacion es aprovatoria", cal);
           
         else
             if(cal <7)
                 System.out.printf("La calificacion no es aprovatoria", cal);
    }
    
}
