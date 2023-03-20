/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alcancevariables;

/**
 *
 * @author dedosjr
 */
public class AlcanceVariables {
/*campo (variable de instancia) accesible para todos los métodos de esta clase
que se oculta al momento de que un metodo contiene una variable del mismo nombre
solo se utilizan cuando mas de dos metodos lo van a usar o si es necesario
guardar su valor entre distintas llamadas a los metodos */
    
    
private static int x = 1; 

// el método main crea e inicializa la variable local x
// y llama a los métodos usarVariableLocal y usarCampo

public static void main( String[] args )
{
int x = 5; // la variable local x del método oculta al campo x 

System.out.printf( "la x local en main es %d\n", x ); usarVariableLocal(); // usarVariableLocal tiene la x local

usarCampo(); // usarCampo usa el campo x de la clase Alcance
usarVariableLocal(); // usarVariableLocal reinicia a la x local
usarCampo(); // el campo x de la clase Alcance retiene su valor

System.out.printf( "\nla x local main es %d\n", x );
} // fin de main // crea e inicializa la variable local x durante cada llamada


public static void usarVariableLocal(){
int x = 25; 

// se inicializa cada vez que se llama a usarVariableLocal y oculta el campo x

System.out.printf("\nla x local al entrar al metodo usarVariableLocal es %d\n", x );
++x;  // modifica la variable x local de este método


System.out.printf("la x local antes de salir del metodo usarVariableLocal es %d\n", x );
} // fin del método usarVariableLocal // modifica el campo x de la clase Alcance durante cada llamada


public static void usarCampo()
{
System.out.printf("\nel campo x al entrar al metodo usarCampo es %d\n", x );

x *= 10; // modifica el campo x de la clase Alcance
System.out.printf("el campo x antes de salir del metodo usarCampo es %d\n", x );
} // fin del método usarCampo
} // fin de la clase AlcanceVariables

