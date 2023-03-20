/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogo2;
import javax.swing.JOptionPane;
/**
 *
 * @author Dedosjr
 */
public class Dialogo2 {


    public static void main(String[] args) {
       //pide al usuario que escriba su nombre 
       String nombre =
         JOptionPane.showInputDialog(" Cual es su nombre ?" );
       
       //crea el mensaje 
       String mensaje = String.format( "Hola %s" ,nombre);
       
       //muestra el mensaje para dar bienvenida al susuario por su nombre 
       
       JOptionPane.showMessageDialog(null , mensaje);
   }
}
