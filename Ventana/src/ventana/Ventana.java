/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventana;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Dedosjr
 */
public class Ventana extends JFrame  implements ActionListener {
JLabel label1;
JButton buton1;
JButton buton2;
JTextField textField1;


//Contructor
public Ventana (){
setLayout(null);
label1=new JLabel ("Hola Mundo");
label1.setBounds(50,50,200,30);
add(label1);
buton1=new JButton ("Texto");
buton1.setBounds(200,200,200,30);
add(buton1);
buton2=new JButton ("Finalizar");
buton2.setBounds(150,150,200,30);
add(buton2);
buton1.addActionListener(this);
textField1=new JTextField ();
textField1.setBounds(100,100,200,30);
add(textField1);

}  


 public void actionPerformed (ActionEvent e){
  if(e.getSource ()== buton1){ 
      //System.exit(0); //Cerrar Ventana 
      String titulo = textField1.getText();
      setTitle(titulo);
  }   
      if(e.getSource ()== buton2){ 
       System.exit(0); 
     
  }  
   
}
     
        
        
       //Main 
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(10,10,400,300);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
    
}
