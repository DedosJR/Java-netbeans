/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacion;

/**
 *
 * @author dedosjr
 */
import java.util.Scanner;

public class Comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
int numero1, numero2;
System.out.print("Escriba el primer numero: ");   
    numero1 = entrada.nextInt();
    System.out.print("Escribael segundo numero: ");
    numero2 = entrada.nextInt();
    
    
    if(numero1 == numero2)
        System.out.printf("%d -= %d\n", numero1, numero2);
   if(numero1 != numero2);
       System.out.printf("%d != %d\n", numero1, numero2);
   if(numero1 < numero2)
        System.out.printf("%d -= %d\n", numero1, numero2);
   if(numero1 > numero2);
        System.out.printf("%d -= %d\n", numero1, numero2);
   if(numero1 <= numero2);
           System.out.printf("%d -= %d\n", numero1, numero2);
   if (numero1 >= numero2);
           System.out.printf("%d -= %d\n", numero1, numero2);

        
}
}
    

