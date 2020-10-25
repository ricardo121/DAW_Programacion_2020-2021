
import java.util.Scanner;

public class Ejercicio1 {

    /*Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado.
    El proceso terminará cuando el número introducido por teclado sea 0*/

    public static void main( String args[] ) {

        int x ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        x = teclado.nextInt();

        while (x != 0) {

            if (x % 2 == 0  ) {
                System.out.println( "Es par" );
            }
            else {
                System.out.println( "Es impar" );
            }

            if (x  > 0  ) {
                System.out.println( "Es Positivo" );
                System.out.println( Math.pow(x,2) );
            }
            else {
                System.out.println( "Es Negativo" );
                System.out.println( Math.pow(x,2) );
            }
            System.out.print("No era cero. Introduce cero: ");
            x = teclado.nextInt();
        }
        System.out.println("Terminado!");
    }

}
