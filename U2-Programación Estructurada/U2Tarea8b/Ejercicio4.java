import java.util.Scanner;

public class Ejercicio4 {

    /*Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
    cuántos son negativos.*/

    public static void main(String args[]) {

        int x ;
        //int y = 0 ;
        int i;


        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        x = teclado.nextInt();

        for (i = 1; i < 10; i++) {

            if( x >= 0) {
                System.out.print("Es Positivo: ");
                System.out.println(x);
                System.out.print("Introduce un numero : ");
                x = teclado.nextInt();
            }else {
                System.out.print("Es negativo: ");
                System.out.println(x);
                System.out.print("Introduce un numero : ");
                x = teclado.nextInt();
            }


        }


    }

}
