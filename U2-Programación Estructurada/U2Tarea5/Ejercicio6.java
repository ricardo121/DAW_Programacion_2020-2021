import java.util.Scanner;

public class Ejercicio6 {

    /*Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario
    el valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
    Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"*/

    public static void main( String args[] ) {

        double x , y = 9.8 , z ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un Tiempo : " );
        x = teclado.nextDouble();
        z = (double) (x * y) ;


        if (x > 0 ) {
            System.out.print( "Velocidad: " );
            System.out.print( z );
            System.out.print( " m/s" );
        }
        else {
            System.out.print( "Tiempo incorrecto" );
        }

    }
}
