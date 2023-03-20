/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rfc2;
import java.util.Scanner;

/**
 *
 * @author Dedosjr
 */
public class RFCMenu {
    public static void main(String[] args) {
       RFC2 rfc2 = new RFC2(); 
       Scanner tec= new Scanner(System.in);
       int opc2;
   do{

      System.out.println("Ingresa la Operacion a Realizar ");
       System.out.println("1. Crear RFC");
        System.out.println("2. Consultar RFC ");
         System.out.println("3. Eliminar RFC ");
         System.out.println("4. Salir ");
          opc2= tec.nextInt();
          
  switch (opc2){
      
      case 1 :
          rfc2.Captura();
          break;
      case 2:
          rfc2.Consulta();
          break;
      case 3:
          rfc2.Borrarrfc();
          break;
      case 4:
         opc2 =4;
          System.out.print("Saliendo...");
                break; 
                
                   default: 
               System.out.println("Opcion Invalida");
                   
           break;
  }
} while (opc2 !=4);
 
    }
    
}

 