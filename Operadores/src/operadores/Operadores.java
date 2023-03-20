/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

/**
 *
 * @author Dedosjr
 */import java.util.Scanner;
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarcion de objetos 
        Scanner entrada = new Scanner (System.in);
        //declaracion de variable 
        int numero1, numero2;
        boolean resultado;
        System.out.print("Escribe el primer numer: ");
        // El metodo nextIn de la clase Scanner permite guardar el valor teclado
        numero1 = entrada.nextInt();
        System.out.print("Escribe el segundo numero: ");
        numero2 = entrada.nextInt();
        resultado = numero1-numero2 > numero1 *numero2; //uso de cuatro operadores 
        
        System.out.printf("Es %b que %d - %d sea mayor a %d * %d\n", resultado, numero1, numero2, numero1, numero2);
        // TODO code application logic here
    }
    
}
