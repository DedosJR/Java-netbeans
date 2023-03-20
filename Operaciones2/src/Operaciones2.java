/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.*;
/**
 *
 * @author Dedosjr
 */
public class Operaciones2 {
  
public int Captura()
{
    int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
    return x;
   
}
public void sumar (int x, int y)
{
    int resultado = x+y;
    JOptionPane.showMessageDialog(null, x + " + " + y + " = " + resultado);
}
public int restar (int x, int y )
{
    int resultado = x-y;
    JOptionPane.showMessageDialog(null, x + "-" + y + " = " + resultado);
    return resultado;
}


public double Division  (double x, double y )
{
     if (x==0)
     JOptionPane.showMessageDialog(null, "No es divisible");
     
     else{      
    double resultado = x/y;
    JOptionPane.showMessageDialog(null, x + "/" + y + " = " + resultado);
    return resultado;
    
 
}
  
  return 0;
}   

public int multiplicar (int x, int y )
{
    int resultado = x*y;
    JOptionPane.showMessageDialog(null, x + "x" + y + " = " + resultado);
    return resultado;
}
     
}
