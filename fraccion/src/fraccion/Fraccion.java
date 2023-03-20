/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraccion;
import java.util.Scanner;
/**
 *
 * @author Dedosjr
 */
public class Fraccion {
private int numerador;
private int denominador;
private double cociente;
Scanner teclado = new Scanner (System.in);

//Metodos 
public void Captura ()
{
    System.out.print("Introduzca el numerador ");
    numerador = teclado.nextInt();
    System.out.print("introduzca el Denominador");
     denominador= teclado.nextInt();
     
}

public void Imprimir()
{
   System.out.println(this.numerador + " / " +
   this.denominador +  " = " + this.cociente);
   
}        
public void Operacion()
{
    this.cociente = (double) this.numerador / this.denominador;
    
}       
//Constructores
public Fraccion ()
{
   
}        
public Fraccion (int n, int d)
{   
    this.numerador = n;
    this.denominador = d;
    this.cociente = (double) this.numerador / this.denominador;
}     
public Fraccion (int n)
{
    this (n, 2);
} 
}