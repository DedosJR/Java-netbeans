/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;
import java.util.Scanner;
/**
 *
 * @author Dedosjr
 */
public class Banco {
Scanner tec= new  Scanner (System.in);
String opcion;




   private Cliente  cliente1, cliente2, cliente3;
   public Banco(){
       cliente1=new Cliente ("Pedro");
       cliente2=new Cliente ("Ines");
       cliente3=new Cliente ("Francisco");
   }
   public void operar(){
       cliente1.depositar(100);
       cliente2.depositar(150);
       cliente3.depositar(200);
       cliente3.extraer(150);
   }
    
    public void depositosTotales()
    {
       int t = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
                System.out.println("El total de dinero enel banco es : "+ t);
                cliente1.imprimir();
                cliente2.imprimir();
                cliente3.imprimir();
    }
    
    
    
    
    public static void main(String[] args) {
       
        Banco banco1=new Banco();
        banco1.operar();
        banco1.depositosTotales();
        
        System.out.println(" Ingrese la Operacion A realizar ");
    }
    
}
