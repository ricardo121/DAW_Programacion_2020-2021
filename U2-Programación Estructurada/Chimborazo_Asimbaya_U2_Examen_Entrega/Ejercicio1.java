
import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {

            int n;

            Scanner num = new Scanner(System.in);


                System.out.print("Ingresa una cantidad entera: ");

                n = num.nextInt();


            for (int i = 0; i < n; ++i) {

                System.out.println();
                //Utilizamos dos "for" para lograr la forma.
                for (int j = 0; j < n-i-1; ++j) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1; ++j){
                    //Condición para imprimir solo los bordes.
                    if ((i==0)||(j==0)||(j==2*i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            //Se utiliza otro grupo de for para lograr la forma de "rombo"
            for (int j = n-2; j >= 0; --j) {
                System.out.println();
                //Utilizamos dos "for" para lograr la forma.
                for (int i = 0; i < n-j-1; ++i) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 2*j+1; ++i) {
                    //Condición para imprimir solo los bordes.
                    if ((j==0)||(i==0)||(i==2*j)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
}
