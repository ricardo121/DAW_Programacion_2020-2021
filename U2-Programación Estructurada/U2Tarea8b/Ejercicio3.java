
import java.util.Scanner;

public class Ejercicio3 {

    /*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
    El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando
    los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
    El número n se debe introducir por teclado.*/

    public static void main(String args[]) {

        int x ;
        int y = 0 ;
        int i;
        int resultado1 = 1 ;
        int resultado2 ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        x = teclado.nextInt();

        for (i = 1; i <= x; i++) {

            resultado2 = y ;
            y = resultado1 + y;
            resultado1 = resultado2;

            //System.out.println("El resultado es: ");
            //System.out.println(resultado1);

        }

        System.out.println("El resultado es: ");
        System.out.println(resultado1);

    }

}
