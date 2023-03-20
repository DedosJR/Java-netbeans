/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;

/**
 *
 * @author Dedosjr
 */
public class ControladorOperaciones2 {

private static String x;

    public static void main(String[] args)
    {
       String recibir;
       int opcion, numero1, numero2;
       
       Operaciones2 objetc = new Operaciones2();
       do 
       {
          recibir = JOptionPane.showInputDialog("Que operacion deseas realizar \n"
          + "1.- Suma \n"
          + "2. - Resta \n"
          + "3. - Division \n"
          + "4. - Multiplicar \n"
          + "5. - Salir \n");
          
          opcion = Integer.parseInt(recibir);
          
          switch (opcion)
              
          {
              case 1:
                  objetc.sumar(objetc.Captura(), objetc.Captura());
                  break;
                  
              case 2:
                  objetc.restar(objetc.Captura(), objetc.Captura());
                
                  break;
                  
                case 3:  
                  objetc.Division(objetc.Captura(), objetc.Captura());
                  break;
                  
                  case 4:  
                  objetc.multiplicar(objetc.Captura(), objetc.Captura());
                  break;
                
              case  5:
                  JOptionPane.showMessageDialog(null, "Gracias por su visita");
                  break;
                  
              default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
          }
       }
         while (opcion !=5); 
    }
 
}

