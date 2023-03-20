/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cicloforsuma;

/**
 *
 * @author dedosjr
 */
public class Cicloforsuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int c, suma, numero, promedio;
       suma=0; 
       for (c=1;c<=10;c++)
       {
           numero= (int)(Math.random()*100+1);
           System.out.print(numero + "\t");
           suma=suma+numero;
           c++;
           
       }
       promedio=suma/10;
       System.out.println("\nLa suma es: " + suma);
       System.out.println("El promedio es : "+ promedio);
    }
    
}
