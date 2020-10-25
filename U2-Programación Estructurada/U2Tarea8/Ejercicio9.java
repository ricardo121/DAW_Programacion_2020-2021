
import java.util.Scanner;

public class Ejercicio9 {

    /*Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
    Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
    Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.*/

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un altura: ");
        int altura = teclado.nextInt();
        int contador1 = 0;
        int contador2 = 0;
        int max_altura = 0;

        while (altura != -1) {

            if (altura>=max_altura){
                max_altura=altura;
                contador2 = contador1;
            }

            System.out.print("Introduce una altura: ");
            altura = teclado.nextInt();
            contador1++ ;

        }
        System.out.println("El arbol mas alto es :" + contador2  );
    }
}
