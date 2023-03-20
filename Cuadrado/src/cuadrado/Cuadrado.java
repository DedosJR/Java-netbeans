/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;
import java.util.Scanner;
/**
 *
 * @author Dedosjr
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    
     private Scanner teclado;
     int lado;
     
    public static void main(String[] args) {
    Cuadrado cuadrado1;
    cuadrado1 = new Cuadrado();
    cuadrado1.inicializar();
    cuadrado1.imprimirPerimetro();
    cuadrado1.imprimirSuperficie();
    }
  
    

    public void inicializar(){
        Scanner teclado = new Scanner (System.in);
     
      
        System.out.println("Ingrese el valor lado");
        lado = teclado.nextInt();
    }
    public void imprimirPerimetro(){
        int perimetro;
        perimetro = lado*4;
        System.out.println("El perimetro es : "+ perimetro);
    }
    
    public void imprimirSuperficie(){
        int superficie;
        superficie = lado*2;
        System.out.println("La Superficie es : "+ superficie);
    }
   
     }
    

