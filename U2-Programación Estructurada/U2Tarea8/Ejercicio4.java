import java.util.Scanner;

public class Ejercicio4 {

    /*Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.*/

    public static void main( String args[] ) {

        int n, contador;
        contador = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu numero: ");
        n = teclado.nextInt();
        do {
            contador++;
            System.out.println(contador);
        }

            while (n != contador) ;
        }

    }


