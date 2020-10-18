
import java.util.Scanner;

public class Ejercicio4 {

    /*Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su
     equivalencia en metros (1 milla = 1609 m).*/

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de millas y se hara la conversion a metros: " );

        int primerNumero = 1609 * teclado.nextInt();

        System.out.print( "El Equivalente es : " );
        System.out.print( primerNumero  );
        System.out.print( " m"  );
    }

}
