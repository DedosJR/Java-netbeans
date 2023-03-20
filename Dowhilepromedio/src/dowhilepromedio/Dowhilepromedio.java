/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhilepromedio;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Dowhilepromedio {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);
  int numero,suma,c,promedio;
  suma=0;
  c=0;
  do{
      System.out.print("Capture un numero El 0 finaliza el programa: ");
      numero=entrada.nextInt();
      if (numero!= 0)
      {
         suma=suma+numero;
         c++;
      }
  }while (numero!=0);
  if (c!=0)
  {
      promedio=suma/c;
      System.out.println("El promedio es :" + promedio);
  }
  else
      
  {
      System.out.println("No se ingresaron numeros");
  }
    }
    
}
