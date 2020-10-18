
import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String args[] ) {

        /*Crea un programa que pida al usuario una temperatura en grados centígrados y calcule
        (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).*/

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de grados y se hara la conversion a Fahrenheit: " );

        int primerNumero = (9 * teclado.nextInt()/5) + 32;

        System.out.print( "El Equivalente es : " );
        System.out.print( primerNumero  );
        System.out.print( " F" );
        
    }

}
