
import java.util.Scanner;

public class Ejercicio2 {

    /**/

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir Edad:");
        int edad = teclado.nextInt();
        System.out.println("Introducir Nivel de Estudios:");
        int nivel_de_estudios = teclado.nextInt();
        System.out.println("Introducir Ingresos:");
        int ingresos = teclado.nextInt();
        boolean jasp;

        if (edad<=28 && nivel_de_estudios>=3 && ingresos>28000){
            jasp = true;
        }else {
            jasp = false;
        }

        System.out.println("El Resultado es Verdadero: "+ jasp  );

    }

}
