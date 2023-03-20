/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventana2;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
/**
 *
 * @author Dedosjr
 */

public class Ventana2 extends JFrame implements ActionListener, ChangeListener  {
JLabel label1;
JCheckBox  check1;
JButton buton1;

public Ventana2(){
    setLayout(null);
    label1= new JLabel ("Acepto");
    label1.setBounds(10,10,400,30);
    add(label1);
    check1 = new JCheckBox ("Aceptar");    
    check1.setBounds(10,50,100,30);
    check1.addChangeListener(this);
    add(check1);
    buton1 = new JButton("Continuar");
    buton1.setBounds(10,100,100,30);
    add(buton1);
    buton1.addActionListener(this);
    buton1.setEnabled(false);
}


public void stateChanged(ChangeEvent e){
  if(check1.isSelected()==true){
      buton1.setEnabled(true);
  }else{
      
  buton1.setEnabled(false);  
}
}

public void actionPerformed(ActionEvent e) {
  if(e.getSource ()== buton1){ 
      System.exit(0); //Cerrar Ventana 
  
  }  
}
    public static void main(String[] args) {
        Ventana2 ventana = new Ventana2();
        ventana.setBounds(0,0,350,200);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }


}

