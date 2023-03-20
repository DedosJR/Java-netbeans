/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cararteraleatorio;
import java.util.Random;
/**
 *
 * @author dedosjr
 */
public class CararterAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        char randomChar;
    
        
        randomChar = (char)(random.nextInt(26) + 'a');
        System.out.println("Generar Random Character: " + randomChar);
    }
    
}
