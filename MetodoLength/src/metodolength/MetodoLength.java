/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodolength;
import java.util.Scanner;
/**
 *
 * @author Dedosjr
 */
public class MetodoLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        System.out.print("Introduce una palabra ");
        palabra = entrada.next();
        
        System.out.println(palabra + " Contiene " + palabra.length() + " Letras");
    }
    
}
