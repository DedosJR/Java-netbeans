/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rfc2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Israel Flores Flores
 */
public class RFC2 {
 Scanner tec = new Scanner (System.in);
    Scanner tec2 = new Scanner (System.in);
     Random random = new Random();
      int randomInt,  randomInt2, randomInt3;
       char randomChar,randomChar2,randomChar3;
           //Declaracion de Variables.
   String  nombre, apepaterno, apematerno, dia, mes, año, dato=null,fecha;
   String rfc;
  
 
        
       //Metodos    
   public void Captura()
   {       
    
   
               System.out.println("Ingresa tu Nombre ");
                  nombre = tec2.nextLine();
                  System.out.println("Ingresa tu Apellido Paterno ");
                   apepaterno = tec2.nextLine();
                    System.out.println("Ingresa tu Apellido Materno ");
                     apematerno = tec2.nextLine();
                      System.out.println("Ingresa tu dia de nacimiento Formato DD " + "Ejemplo 12 ");
                       dia = tec2.nextLine();
                      System.out.println("Ingresa tu mes de nacimiento Formato MM " + "Ejemplo 01 ");
                        mes = tec2.nextLine();
                       System.out.println("Ingresa tu año de nacimiento Formato AAAA " + "Ejemplo 1990 ");
                        año = tec2.nextLine();
                        System.out.println(" RFC Creado Con Exito \n");
           //Homoclave
    {
        String cadena = "0123456789";
         String cadena2 = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
          String cadena3 = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789";    
         randomInt = random.nextInt (cadena.length());
         randomInt2 = random.nextInt (cadena2.length());
          randomInt3 = random.nextInt (cadena3.length());
           randomChar = cadena.charAt (randomInt);
            randomChar2 = cadena2.charAt (randomInt2);
             randomChar3 = cadena3.charAt (randomInt3); 
             
              rfc= apepaterno.trim().substring(0, 2);        
               rfc= rfc.concat(apematerno.trim().substring(0, 1));
                rfc= rfc.concat(nombre.trim().substring(0, 1));
                 rfc= rfc.concat(año.trim().substring(2, 4));
                  rfc= rfc.concat(mes);
                  rfc= rfc.concat(dia);                
            rfc= rfc + " " + randomChar + randomChar2 + randomChar3;
              dato= nombre +" " + apepaterno+" " + apematerno;             
               fecha= dia+ "/"+ mes+ "/" + año;
   }
    }
   
   // Consultar RFC
   public void Consulta()         
   {
       if("".equals(rfc) || rfc==null){
            System.out.print("\n RFC No Capturado \n ");
       
   }else
          System.out.println(dato.toUpperCase() + " Nacido el : " + fecha + " Tu RFC es : " + rfc.toUpperCase() + "\n");
 
   }
   
    

   public String Borrarrfc()
   {
      rfc=" ";
      dato="";
      fecha="";
        System.out.print("Su RFC  Se ha eliminado \n ");
        return rfc;  
   }        
       
}

