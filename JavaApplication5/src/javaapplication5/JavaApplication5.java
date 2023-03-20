/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Dedosjr
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entero;
String cadena;
char caracter;
double doble;
float flotante;
Boolean booleano;

// Convertir String a Integer
entero = Integer.valueOf("900");
entero = Integer.parseInt("900");
System.out.printf("String a Integer = %d\n", entero);

// Convertir Integer a String
cadena = String.valueOf(500);
cadena = Integer.toString(500);
System.out.printf("Integer a String = %s\n", cadena);

// Convertir char a String
cadena = Character.toString('A');
System.out.printf("Char a String = %s\n", cadena);

// Convertir String a char
cadena="Hola";
caracter = cadena.charAt(0);// el cero indica la posicion del caracter a mostrar
System.out.printf("String a char = %s\n", caracter);

// Convertir String a Double
doble = Double.parseDouble("900.1");
System.out.printf("String a Double = %.2f\n", doble);

// Convertir Double a String
cadena = String.valueOf(900.5);
System.out.printf("Dobule a String = %s\n", cadena);

// Convertir String a Float
flotante = Float.parseFloat("900.5");
System.out.printf("String a Float = %.2f\n", flotante);

// Convertir Float a String
cadena = Float.toString(900.2f);
System.out.printf("Float a String = %s\n", cadena);

// Convertir String a Boolean
booleano = Boolean.valueOf("true");
booleano = Boolean.parseBoolean("true");
System.out.printf("String a Boolean = %s\n", booleano);

// Convertir Boolean a String
cadena = String.valueOf(false);
cadena = Boolean.toString(false);
System.out.printf("Boolean a String = %s\n", cadena);
    }
    
}
