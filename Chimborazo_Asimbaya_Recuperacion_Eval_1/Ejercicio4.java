import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int[] indice = new int[10];
        int[] valor = new int[10];
        int[] resultado = new int[10];



        for (int i = 0; i < valor.length; i++) {

            System.out.print("Valor " + i + ": ");
            valor[i] = teclado.nextInt();

        }





        for (int i = 0; i < indice.length; i++) {

            indice[i] = i ;

        }

        System.out.println(Arrays.toString(indice));
        System.out.println(Arrays.toString(valor));
        int contador=0;
        for (int i = 0; i < resultado.length; i++) {

            for (int j = 0; j < valor[i]; j++) {

                if (valor[i] % j == 0) {
                    resultado[i] = valor[i];
                }
            }
        }

        System.out.println(Arrays.toString(resultado));



    }

}
