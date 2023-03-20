package bancomenumetodos;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Dedosjr
 */
public class ClienteOperacion {
    private String nombre,cliente1;
     private int  m,saldo, monto, retiro;
   

 
public void registro(){
    nombre= JOptionPane.showInputDialog("Ingrese su nombre");
    cliente1=nombre;
}
  
    public void depositar (){
        
        monto= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a depositar"));
     JOptionPane.showMessageDialog(null, nombre + " Gracias por su deposito a su cuenta: $"+ monto);
       saldo=saldo+monto;
       m= m+monto;
    } 
     public int retornarMonto(){
     return saldo;
    
         
     }

    public void extraer (){
          retiro= Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea retirar"));
          m = m - retiro;
        saldo=saldo-retiro;
    }

    
    // Metodo para imprimir el saldo de la cuenta 
    public void imprimir (){
      JOptionPane.showMessageDialog(null, cliente1 + " Tiene un saldo de : " + m);
        
        
    }
  
    
    //Metodo para imprimir saldo total del banco 
      public void SaldoTotal (){
            
            JOptionPane.showMessageDialog(null, " El Banco tiene un saldo de : " + saldo);
        
        
    }
    
}