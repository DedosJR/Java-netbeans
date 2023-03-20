/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch2;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
     int dias, mes, anio;
     dias=0;

       System.out.print("Capture un mes con formato mm ");
        mes=entrada.nextInt();
        System.out.print("Capture un año con formato aaaa ");
         anio=entrada.nextInt();
         
          switch (mes) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
           dias = 31;
           break;
           case 4:
           case 6:
           case 9:
           case 11:
                dias = 30;
                break;
        case 2:
           if ( ((anio % 4 == 0) && (anio % 100 != 0))
             || (anio % 400 == 0) )
              dias = 29;
           else
             dias = 28;
            break;
           }
             System.out.println("Tu mes tiene " + dias + " dias");
           }
       }

   
