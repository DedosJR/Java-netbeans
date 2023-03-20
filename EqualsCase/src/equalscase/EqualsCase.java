/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equalscase;

/**
 *
 * @author dedosjr
 */
public class EqualsCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        String animal11 = "Caballo";
        String animal12 = "Negro";
        String anima13;
        
        
       anima13 = animal11 + animal12;
       
       System.out.println(anima13.equalsIgnoreCase("CaballoNegro"));
       System.out.println(anima13.equalsIgnoreCase("caballonegro"));
    }
    
}
