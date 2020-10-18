
import java.util.Scanner;

public class Ejercicio2 {

    /*Crea un programa que pida al usuario su año de nacimiento y el año actual
    (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.*/

    public static void main( String args[] ) {


        short x  , y  , z ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Fecha Actual: " );
        x = teclado.nextShort();
        System.out.print( "Fecha de Nacimiento: " );
        y = teclado.nextShort();

         z = (short)(x-y) ;
        System.out.print( "Edad: " );
        System.out.println( z);
    }


}
