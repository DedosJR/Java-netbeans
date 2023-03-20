/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilecondicion;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Whilecondicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int c, aceptados, numero;
    float medida;
    c=1;
    aceptados=0;
  
    System.out.print(" Cuantas piezas procesaran ");
    numero=entrada.nextInt();
    while (c<=numero)
    {
        System.out.print("ingrese la medida de la pieza");
        medida=entrada.nextFloat();
        if (medida >=1.20 && medida <=1.30)
            {
            aceptados++;
            }
         c++;
       }
    
      System.out.println("La cantidad de piezas aceptadas son :"+ aceptados);
        
    }
   
 }

