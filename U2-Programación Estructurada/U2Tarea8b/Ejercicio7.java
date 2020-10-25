import java.util.Scanner;

public class Ejercicio7 {

    /*Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.*/

    public static void main( String args[] ) {


        int longitud ;
        int i ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        String frase = teclado.next();

        longitud = frase.length() ;

        System.out.print("Numero al revés: ");

        for (  i=longitud -1 ; i>=0 ; i-- ) {

            char c = frase.charAt(i);

             System.out.print(c);

        }


    }

}
