
import java.util.Scanner;

public class Ejercicio2 {

    /*Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle
     si lo ha hecho correctamente o no.*/

    public static void main( String args[] ) {

        int x ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el número 12 : " );
        x = teclado.nextInt();

        if (x == 12) {
            System.out.print( "Lo ha hecho correctamente" );
        }
        else {
            System.out.print( "No lo ha hecho correctamente" );
        }
    }

}

