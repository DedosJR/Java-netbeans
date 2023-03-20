/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

public class Cliente {
    private String nombre;
    private int monto;
    
    
    public Cliente (String nom){
     nombre=nom;
     monto=0;
    
    }
    public void depositar (int m){
        monto= monto+m;
        
    }
    
    public void extraer (int m){
     monto=monto-m;
     
    }
    public int retornarMonto(){
     return monto;
     
    }
    public void imprimir (){
        System.out.println(nombre+" Tiene un saldo de : "+ monto);
    }
    
}
