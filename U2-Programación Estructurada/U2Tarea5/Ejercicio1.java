
import java.util.Scanner;

public class Ejercicio1 {

    /*Crea un programa que pida un número entero al usuario y diga si es positivo
    (mayor que cero) o si, por el contrario, no lo es (usando "else").*/

    public static void main( String args[] ) {

        int x ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número: " );
        x = teclado.nextInt();

        if (x >= 0) {
            System.out.print( x );
            System.out.print( " Positivo " );
        }
        else {
            System.out.print( x );
            System.out.print( " Negativo" );
        }
    }

}
