import java.util.Scanner;

public class Ejercicio5 {

    /*Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
    El carácter con el que se pinta la pirámide también se debe pedir por teclado.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int numFilas = sc.nextInt();
        System.out.print("Introduzca Caracter: ");
        char caracter = sc.next().charAt(0);

        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }

            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

}
