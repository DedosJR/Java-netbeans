/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma2numeros;

/**
 *
 * @author Dedosjr
 */
import java.util.Scanner;
public class Suma2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int num1, num2, suma;
        
        System.out.println("Escribe el primer numero");
        num1=entrada.nextInt();
        System.out.println("Escribe el segundo numero");
        num2=entrada.nextInt();
        
        //suma = num1 + num2;
        
        //Sytem.out.println(
        System.out.printf("El resultado es %d\n",num1+num2);
    }
    
}
