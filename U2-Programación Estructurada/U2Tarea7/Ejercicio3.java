
import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 122 + 97) ;
        int ascii = numeroAleatorio;

        System.out.print( "Su Division es: " );
        System.out.println( numeroAleatorio );
    }

}
