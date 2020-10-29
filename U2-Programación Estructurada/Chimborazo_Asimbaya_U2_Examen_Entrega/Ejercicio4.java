import java.util.Scanner;

public class Ejercicio4 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero : ");
        int numero = sc.nextInt();
        int contador = 0;


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

                    for ( int i=1 ; i<=filas ; i++ ) {
                        if (filas % i == 0) {
                            contador++;
                        }

                    }
                    if (contador==2){
                        System.out.print("Primo");
                    }else {
                        System.out.print("No Primo");
                    }
                    contador=0;
                }

            }
            System.out.println();

        }
    }

    }


