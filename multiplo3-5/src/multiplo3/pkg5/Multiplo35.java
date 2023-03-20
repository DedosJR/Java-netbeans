/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplo3.pkg5;

/**
 *
 * @author dedosjr
 */
public class Multiplo35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int multiplo3, multiplo5, numero, c;
multiplo3 = 0;
multiplo5=0;
for(c=1;c<=10;c++)
       {
           numero=(int)(Math.random()*100+1);
           System.out.print(numero + "\t");
           if(numero%3==0)
           {
               multiplo3++;
           }
           
           if(numero%5==0)
           
           {
            multiplo5++;
           }
                 
            
        }

System.out.println("\nCantidad de multiplo de 3: "+ multiplo3);
System.out.println("Cantidad de multplos de 5: "+ multiplo5);
    }
    
}
