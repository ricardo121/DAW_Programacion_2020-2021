import java.util.Scanner;

public class Ejercicio10 {

    /*Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar.
    El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.*/

    public static void main( String args[] ) {

        int x ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entre 1- 10: ");
        int resultado;
        x = teclado.nextInt();

        while (x>0 && x<11) {
            System.out.print("Introduce un numero entre 1- 10: ");
            x = teclado.nextInt();
        }
        int i;
        for ( i=1 ; i<=10 ; i++ ) {
            resultado = resultado * i ;
            System.out.print("Resultado"+resultado);
        }

    }

}
