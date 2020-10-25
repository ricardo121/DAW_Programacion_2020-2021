
import java.util.Scanner;

public class Ejercicio2 {

    /*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
    números enteros a partir de uno que se introduce por teclado.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero : ");
        int numero = sc.nextInt();


        System.out.println();
        //filas
        for(int filas = numero; filas <numero+5; filas++){

            //columnas
            for(int columnas=0; columnas<=2; columnas++){
                if (columnas==0) {
                    System.out.print(filas);
                    System.out.print(" ");

                }
                else if (columnas==1){
                    System.out.print(filas*filas);
                    System.out.print(" ");

                }
                else if (columnas==2){
                    System.out.print(filas*filas*filas);
                    System.out.print(" ");

                }
            }
            System.out.println();

        }
    }


}






