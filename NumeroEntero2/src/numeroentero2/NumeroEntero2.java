/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroentero2;

import java.util.Scanner;

/**
 *
 * @author dedosjr7
 */
public class NumeroEntero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner entrada = new Scanner (System.in);
        int numero;
        double modulo;
        
        System.out.print("Escribe un numero: ");
        numero = entrada.nextInt();
        modulo= numero %2;
        
        if(modulo == 0)
            System.out.printf("El id %d es un numero par" , numero);
    }
    }
    

 