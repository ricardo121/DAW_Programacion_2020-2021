
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        long numero;
        long falta,numeroInvertido,resto;
        int cont;

        long num1=1 ;
        long num2=2 ;
        long num3=3;
        long num4=4 ;
        long num5=5 ;
        long num6=6 ;
        long num7=7 ;
        long num8=8 ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        numero = teclado.nextLong();


        while(numero<=0);
        falta=numero;
        numeroInvertido=0;
        resto=0;
        cont=0;


        while(falta!=0)
        {
            resto = falta % 10;
            if (resto==num1){

            }

            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }




        System.out.println("Los números partidos son el " +" y el ");


    }


}
