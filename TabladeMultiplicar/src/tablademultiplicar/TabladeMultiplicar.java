/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;
import java.util.Scanner;

/**
 *
 * @author Dedosjr
 */
public class TabladeMultiplicar {

   public void cargarValor(){
       Scanner teclado= new Scanner(System.in);
       int valor;
       do{
           System.out.println();
           System.out.println("Ingrese el valor");
           valor= teclado.nextInt();
           if(valor !=-1){
             calcular(valor);  
          
       
       }
       }while(valor !=-1);
   }
   public void calcular(int v){
       for(int f=v; f<=v*10; f=f+v){
           
          System.out.print(f+ " ");
   }
   }
    public static void main(String[] args) {
    TabladeMultiplicar tabla;
    tabla= new TabladeMultiplicar();
    tabla.cargarValor();
    }
    
}
