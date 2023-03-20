/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rfc;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Dedosjr
 */
public class RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner tec = new Scanner (System.in);
    Scanner tec2 = new Scanner (System.in);
     Random random = new Random();
     
           //Declaracion de Variables.
   String  nombre = null, apepaterno = null, apematerno = null, dia = null, mes = null, año = null;
   String rfc=null;
   int opc=0;
   
   //Homocalve
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
       
        
   System.out.println("Bienvenido al sistema de trabajadores\n");
   
       // Ciclo y menu de opciones 
   do{
       
      System.out.println("Ingresa la Operacion a Realizar ");
       System.out.println("1. Crear RFC");
        System.out.println("2. Consultar RFC");
         System.out.println("3. Eliminar RFC");
         System.out.println("4. Salir");
          opc = tec.nextInt();
      
       switch (opc){
                  // Captura de datos para generar RFC
           
           case 1: 
                 System.out.println("Ingresa tu Nombre ");
                  nombre = tec2.nextLine();
                  System.out.print("Ingresa tu Apellido Paterno ");
                   apepaterno = tec2.nextLine();
                    System.out.println("Ingresa tu Apellido Materno ");
                     apematerno = tec2.nextLine();
                      System.out.println("Ingresa tu dia de nacimiento Formato DD " + "Ejemplo 12 ");
                       dia = tec2.nextLine();
                      System.out.println("Ingresa tu mes de nacimiento Formato MM " + "Ejemplo 01 ");
                        mes = tec2.nextLine();
                       System.out.println("Ingresa tu año de nacimiento Formato AAAA " + "Ejemplo 1990 ");
                        año = tec2.nextLine();
                        System.out.println("RFC Creado Con Exito");
                        rfc= apepaterno.trim().substring(0, 2);
                        
               rfc= rfc.concat(apematerno.trim().substring(0, 1));
                rfc= rfc.concat(nombre.trim().substring(0, 1));
                rfc= rfc.concat(año.trim().substring(2, 4));
                 rfc= rfc.concat(mes);
                 rfc= rfc.concat(dia);
          break;
          
                 // Consulta de RFC
           case 2:
                if("".equals(rfc)|| rfc ==null){
     System.out.println("NO CAPTURADO");  
                } 
             System.out.println("Su RFC Es : " + rfc.toUpperCase() + " " + randomChar + randomChar2 + randomChar3);
          
              
            break;
            
           // Limpiar RFC 
           case 3:
            rfc="";
              System.out.println(" RFC Borrado");
            return rfc;
        break;
        
        // Salir del Programa 
           case 4: 
               
        
           default: 
               System.out.println("Opcion Invalida");
                   
           break;
   }
           
   
 
   
   
    
  
        // Condicion para continuar con el ciclo 
     }while (opc <4);
            
    
   
     } 


    }

