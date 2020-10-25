import java.util.Scanner;

public class Ejercicio10 {

    /*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá
    la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para
    simular la curvatura de las esquinas inferiores.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        int numFilas = sc.nextInt();
        System.out.print("Introduzca Caracter: ");
        char caracter = sc.next().charAt(0);
        int mitad = numFilas / 2;

        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco

            if (altura<numFilas) {

                for(int asteriscos=1; asteriscos<2; asteriscos++){
                    System.out.print(caracter);
                }

                for(int asteriscos=1; asteriscos<2; asteriscos++){
                    System.out.print(" ");
                }
                for(int asteriscos=1; asteriscos<2; asteriscos++){
                    System.out.print(caracter);
                }

            }
            if (altura==numFilas) {

                for(int asteriscos=mitad-mitad; asteriscos<3; asteriscos++){
                    System.out.print(caracter);
                }

            }
            System.out.println();
        }
    }

}
