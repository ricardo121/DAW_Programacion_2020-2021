import java.util.Scanner;

public class Ejercicio5 {

    /*Crea un programa que pida tres números enteros largos al usuario y
    diga cuál es el mayor de los tres.*/

    public static void main( String args[] ) {

        int x , y , z ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextInt();
        System.out.print( "Introduzca otro número : " );
        y = teclado.nextInt();
        System.out.print( "Introduzca otro número : " );
        z = teclado.nextInt();


        if (x >= y  && x >= z ) {
            System.out.println( x );
            System.out.println( "Es el Mayor" );
        }
        else if (y >= x  && y >= z ) {
            System.out.println( y );
            System.out.print( "Es el Mayor" );
        }
        else {
            System.out.println( z );
            System.out.print( "Es el Mayor" );
        }
    }

}
