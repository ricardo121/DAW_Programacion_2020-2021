import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numElem;



        int x[] = {101, 232, 5, 15, 121};
        filtraCapicuas(x);
        System.out.println("El contenido de la tabla es " + Arrays.toString(x));
        System.out.println("El contenido de la tabla es "+ Arrays.toString(filtraCapicuas(x)));
        teclado.close();
    }


    static int[] filtraCapicuas(int x[]) {

        int numero;
        int falta,numeroInvertido,resto;
        Scanner teclado = new Scanner(System.in);

        int t[] = new int[5];
        for (int i = 0; i < 5; i++) {

            if (i < 5) {

                int cont = 0;

                while (t[i] <= 0) ;
                falta = t[i];
                numeroInvertido = 0;
                resto = 0;

                while (falta != 0) {
                    resto = falta % 10;
                    numeroInvertido = numeroInvertido * 10 + resto;
                    falta = falta / 10;
                }

                if (numeroInvertido == t[i]) {
                    t[i] = falta;
                }
            }

        }
        return t;
    }


}
