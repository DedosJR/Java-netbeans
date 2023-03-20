/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomcadena;
import java.util.Random;

/**
 *
 * @author dedosjr
 */
public class RandomCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random= new Random ();
      int randomInt,  randomInt2, randomInt3;
       char randomChar,randomChar2,randomChar3;
        String cadena = "0123456789";
         String cadena2 = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
          String cadena3 = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789";
        
        randomInt = random.nextInt (cadena.length());
         randomInt2 = random.nextInt (cadena2.length());
          randomInt3 = random.nextInt (cadena3.length());
           randomChar = cadena.charAt (randomInt);
            randomChar2 = cadena2.charAt (randomInt2);
             randomChar3 = cadena3.charAt (randomInt3);
 System.out.println("Carater random de una cadena " + randomChar + randomChar2 + randomChar3);
    }
    
}
