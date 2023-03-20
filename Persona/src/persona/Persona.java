/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Persona {

String nombre;
int edad;


public void inicializar(){
 Scanner entrada;
    entrada=new Scanner (System.in);
       System.out.println("Ingrese nombre:");
       nombre = entrada.next();
       System.out.println("Ingrese edad:");
       edad=entrada.nextInt();
       
}
    
public void imprimir(){
       System.out.println("Nombre: " +nombre);
       System.out.println("Edad: "+edad);
}

public void MayorEdad(){
    if (edad>=18){
        System.out.print(nombre+" es mayor de edad");
    } else {
        System.out.print(nombre+" no es mayor de edad");  
    }
   
}
    public static void main(String[] args) {
        Persona persona1, persona2;
        persona1=new Persona();
        persona2=new Persona();
        
        persona1.inicializar();
        persona1.imprimir();
        persona1.MayorEdad();

        persona2.inicializar();
        persona2.imprimir();


    }   
}
