
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static int subcorteza(int[][] n, int posicion){

        //Hallar el numero de para decir el numero de valores para el nuevo array
        int tamai= n.length;
        int tamaj= n[1].length;
        int resultado = 0;
        //System.out.println("tabla   "+ tamai);
        //System.out.println("tabla  adio "+ tamaj);

        int filas = 0;


        int cont1 = 0;
        int cont2 = 0;


        for (int j = 0; j < tamaj; j++){

            cont1 = cont1 + 1;

        }
        for (int j = 0; j < tamaj; j++){


            cont1 = cont1 + 1;

        }
        for (int j = 0; j < tamaj; j++){


            cont1 = cont1 + 1;

        }
        for (int j = 0; j < tamaj; j++){


            cont1 = cont1 + 1;

        }
        for (int j = 0; j < tamaj; j++){


            cont1 = cont1 + 1;

        }


        int resu[] = new int[cont1];

        for (int j = 0; j < tamaj; j++){

            resu[cont2] = n[filas][j];
            cont2 = cont2 + 1;

        }
        for (int j = 0; j < tamaj; j++){

            resu[cont2] = n[filas+1][j];
            cont2 = cont2 + 1;

        }
        for (int j = 0; j < tamaj; j++){

            resu[cont2] = n[filas+2][j];
            cont2 = cont2 + 1;

        }
        for (int j = 0; j < tamaj; j++){

            resu[cont2] = n[filas+3][j];
            cont2 = cont2 + 1;

        }
        for (int j = 0; j < tamaj; j++){

            resu[cont2] = n[filas+4][j];
            cont2 = cont2 + 1;

        }

        ///
        if (posicion<cont1) {
            for (int i = 0; i < tamai; i++) {


                resultado = resu[posicion];


            }


            int longitud = resu.length;
            for (int i = 0; i < longitud; i++) {
                if (posicion  == i) {
                    resultado = resu[i];
                }
            }
        }else{
            resultado=-1;
        }

        //System.out.println(Arrays.toString(resu));
        //Devolver el Array Resultado[]
        return resultado;


    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);


        int tamai = 5;
        int tamaj = 6;

        int n[][] = new int[tamai][tamaj];

        for (int i = 0; i < tamai; i++){

            for (int j = 0 ; j < tamaj ; j++){

                n[i][j] =(int) (Math.random() *(1000-100+1) + 100);

            }

        }

        for (int i = 0; i < tamai; i++){

            System.out.println(Arrays.toString(n[i]));

        }








    }

}
