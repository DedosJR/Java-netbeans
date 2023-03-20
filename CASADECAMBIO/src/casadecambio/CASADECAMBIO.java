/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casadecambio;
import java.util.Scanner;

/** 
 * 
 * El propietario de una casa de cambio cobra el 15 % de comisión sobre la cantidad en dólares a cambiar por el cliente.
 * Elabore un algoritmo que lea el tipo de cambio del día y la cantidad en dólares a cambiar por el cliente.
 * Se pide calcular e imprimir la comisión cobrada al cliente y la cantidad en pesos que se le entregará.
 * Comision 15%
 * Tipo de cambio 19.80
 * 
 *
 * @author Flores Israel
 */
public class CASADECAMBIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        // Variables 
     double tc;
     double comision;
     double total; 
     double dollares;
     double pago;
     
     //Datos de entrada 
    System.out.println("Bienvenido, El tipo de cambio de hoy es:  $19.80");

        System.out.println("Ingrese la cantidad de Dolares a Cambiar");
     dollares = entrada.nextDouble();
 
     
     
     //Operacion para calucular el total de pago 
         tc = 19.80;   
           total= tc * dollares; 
           System.out.println("Pago por su dollar : " + total);
           
                   //Operacio para comision 
                  comision = total* 0.15;
                   System.out.println("Comision por Servicio : " + comision );
                   
                     //Total a pagar
                   pago = total - comision; 
                      System.out.println("Total a pagar : " + pago);

       
    }
    
}
