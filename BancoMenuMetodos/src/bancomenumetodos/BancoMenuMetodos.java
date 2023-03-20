/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancomenumetodos;

import javax.swing.*;
/**
 *
 * @author Dedosjr
 */
public class BancoMenuMetodos {

 public static void main(String[] args) {
     ClienteOperacion banco1= new ClienteOperacion();
     
       //Variable
        int opcion;
        
        
//Menu opciones 
do {
    
     opcion= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la operacion a realizar \n"
             +"1. Registro\n"
             +"2. Deposito\n"
             +"3. Retirar\n" 
             +"4. Consulta monto Banco\n"
             +"5. Consulta monto cliente\n"
             +"6. Salir \n"));
         
 
     
 
///Menu operacion llamar a metodos segun la opcion      
          
switch (opcion){
    
    case 1:
      banco1.registro();
      break;
    
    case 2:
      banco1.depositar();
      break;
      
    case 3: 
      banco1.extraer();
      break;
      
    case 4:
       banco1.SaldoTotal();
       break;
        
    case 5: 
        banco1.imprimir();
        break;
        
    case 6:
       JOptionPane.showMessageDialog(null, "Gracias por ser cliente de MNT Bank");
       break;
        
    default:
        JOptionPane.showMessageDialog (null, " Opcion Incorrecta Intente de nuevo");
            break;
  }
       
} while(opcion !=6);


   }
    
}



   
 
