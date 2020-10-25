import java.util.Scanner;

public class Ejercicio4 {

    /*Diseñar un programa que pida una frase al usuario, e indique si el carácter de
    la posición central es o no un espacio.*/

    public static void main(String args[]) {

        int longitud ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca frase: ");

        String frase = teclado.nextLine();
        longitud = frase.length() / 2 ;
        String mitad = frase.substring(longitud, longitud + 1);
        String espacio = " ";
        if (mitad.equals(espacio)) {
            System.out.println("Es un espacio");
        } else {
            System.out.println("No es un espacio");
        }


    }
}
