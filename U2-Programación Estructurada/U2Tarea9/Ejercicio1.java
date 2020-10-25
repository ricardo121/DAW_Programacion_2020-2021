import java.util.Scanner;

public class Ejercicio1 {

    /*Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.*/

    public static void main( String args[] ) {


        int x , y ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce Primera palabras: ");
        String palabra1 = teclado.next();
        System.out.print("Introduce Segunda palabras: ");
        String palabra2 = teclado.next();
        x = palabra1.length();
        y = palabra2.length();

        if ( x > y){

            System.out.println("La palabra mas corta es: " + palabra2 );

        }else {
            System.out.println("La palabra mas corta es: " + palabra1 );
        }


    }

}
