
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String args[]) {

        long numero;
        long falta,numeroInvertido,resto;
        int par,impar;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();


        while(numero<=0);
        falta=numero;
        numeroInvertido=0;
        resto=0;
        par=0;
        impar=0;

        while(falta!=0)
        {


                resto = falta % 10;
                numeroInvertido = numeroInvertido * 10 + resto;
                falta = falta / 10;

                if(resto%2==0){
                    par++;
                }else {
                    impar++;
                }

        }
        System.out.println("Contiene " + par + " digitos pares y " + impar + " digitos impares");





    }


}
