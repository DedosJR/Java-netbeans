/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones1;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Operaciones1 {
private Scanner teclado;
    int  valor1,valor2;
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese primer valor: ");
        valor1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:" );
        valor2=teclado.nextInt();
       
    }
    public void sumar(){
     int suma;
     suma=valor1+valor2;
     System.out.println("La suma es: "+suma);
    }  
    
    public void restar(){
     int resta;
     resta=valor1-valor2;
     System.out.println("La resta es: "+resta);
    }  
    
     public void multiplicar(){
     int multiplicacion;
     multiplicacion=valor1*valor2;
     System.out.println("La multiplicacion  es: "+multiplicacion);
    }  
    
     public void division(){
     int division;
     division=valor1/valor2;
     System.out.println("La division  es: "+division);
    }  
    
      
    
    public static void main(String[] args) {
       Operaciones1 opera;
       opera=new Operaciones1();
       opera.inicializar();
       opera.sumar();
       opera.restar();
       opera.division();
       opera.multiplicar();
       
       
    }
    
}
