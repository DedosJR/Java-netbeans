/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;
import java.util.Scanner;
/**
 *
 * @author Dedosjr
 */
public class MayorMenor {
public void cargarValores(){
    int valor1, valor2, valor3,mayor, menor;
  Scanner teclado=new Scanner( System.in); 
  
  System.out.print("Ingrese el primer valor ");
  valor1 = teclado.nextInt();
  System.out.print("Ingrese el Segundo valor ");
  valor2 = teclado.nextInt();
  System.out.print("Ingrese el Tercer  valor ");
  valor3 = teclado.nextInt();
  mayor=calcularMayor(valor1,valor2,valor3);
  menor=calcularMenor(valor1,valor2,valor3);
  System.out.print("El mayor de los tres numeros es :" + mayor + "\n");
   System.out.print("El menor de los tres numeros es :" + menor);
   
}
public int calcularMayor(int v1, int v2, int v3){
    int valor;
    if(v1>v2 && v1>v3){
        valor= v1;
    } else{
        if(v2>v3){
            valor=v2;
        }else{
            valor=v3;
        }
    
    }
    return valor;
}
    
    public int calcularMenor(int v1, int v2, int v3){
    int valor;
    if(v1<v2 && v1<v3){
        valor= v1;
    } else{
        if(v2<v3){
            valor=v2;
        }else{
            valor=v3;
        }
    
    }
    return valor;
}
    
    
    
    
    
    public static void main(String[] args) {
       MayorMenor maymen=new MayorMenor();
       int valor;
       maymen.cargarValores();
       valor= maymen.calcularMenor(3, 5, 9);
       System.out.print("\nEl menor de los tres numeros es :" + valor + "\n");
    }
    
}
