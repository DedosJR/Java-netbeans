/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimiriniciales;
import java.util.Scanner;
/**
 *
 * @author Dedosjr
 */
public class ImprimirIniciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String nombre;
        String apellidopaterno;
        String apellidomaterno;
        
        System.out.println("Ingrese su nombre completo");
        nombre = stdIn.next();
        apellidopaterno = stdIn.next();
        apellidomaterno = stdIn.next();
        System.out.println("Sus iniciales son : " + nombre.charAt(0) + apellidopaterno.charAt(0)+apellidomaterno.charAt(0) +".");
    }
    
}
