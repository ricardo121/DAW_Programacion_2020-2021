
import java.util.Scanner;

public class Ejercicio4 {

    /*Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule
    su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).*/

    public static void main( String args[] ) {

            float x ,z ;

            Scanner teclado = new Scanner(System.in);
            System.out.print( "Introduzca un numero de millas para hacer la conversion a KM: " );
            x = teclado.nextFloat();

            z = (float)(x * 1.609) ;
            System.out.print( "Su Equivalencia en Km: " );
            System.out.print( z );
            System.out.print( " Km" );

    }

}
