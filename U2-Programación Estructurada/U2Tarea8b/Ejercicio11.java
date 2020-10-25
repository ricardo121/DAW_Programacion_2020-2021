
import java.util.Scanner;

public class Ejercicio11 {

    /*Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
    Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe
    mostrar un mensaje de error.*/

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca altura: ");
        int altura=teclado.nextInt();

        while(altura%2==0 || altura<3) {
            System.out.print("Altura erronea: ");
            altura=teclado.nextInt();
        }

        for (int i=1; i<=altura; i++) {

            for(int j=1; j<=altura ; j++) {

                if(j==i || j==(altura-i)+1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        teclado.close();
    }

}
