/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dado;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author dedosjr
 */
public class Dado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random numerosAleatorios = new Random(); // generador de números aleatorios



int frecuencia1 = 0; // cuenta de veces que se tiró 1
int frecuencia2 = 0; // cuenta de veces que se tiró 2
int frecuencia3 = 0; // cuenta de veces que se tiró 3
int frecuencia4 = 0; // cuenta de veces que se tiró 4
int frecuencia5 = 0; // cuenta de veces que se tiró 5
int frecuencia6 = 0; // cuenta de veces que se tiró 6



int cara; // almacena el valor que se tiró más recientemente

// sintetiza los resultados de tirar un dado 6,000,000 veces
for ( int tiro = 1; tiro <= 6000; tiro++ )
{
cara = 1 + numerosAleatorios.nextInt( 6 ); // número del 1 al 6

// determina el valor del tiro de 1 a 6 e incrementa el contador apropiado
switch ( cara )
{
case 1:
++frecuencia1; // incrementa el contador de 1s
break;
case 2:
++frecuencia2; // incrementa el contador de 2s
break;
case 3:
++frecuencia3; // incrementa el contador de 3s
break;
case 4:
++frecuencia4; // incrementa el contador de 4s
break;
case 5:
++frecuencia5; // incrementa el contador de 5s
break;
case 6:
++frecuencia6; // incrementa el contador de 6s
break; // opcional al final del switch
} // fin de switch
} // fin de for



System.out.println( "Cara\tFrecuencia" ); // encabezados de salida
System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
frecuencia1, frecuencia2, frecuencia3, frecuencia4,
frecuencia5, frecuencia6 );
} // fin de main
} // fin de la clase Dado