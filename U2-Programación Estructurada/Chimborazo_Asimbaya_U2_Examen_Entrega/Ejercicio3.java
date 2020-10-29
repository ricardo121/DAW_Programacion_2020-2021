
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String args[]) {

        long numero,posicion,numero_nuevo,resultado;
        long falta,numeroInvertido,resto;
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        posicion = teclado.nextLong();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        numero_nuevo = teclado.nextLong();

        while(numero<=0);
        falta=numero;
        numeroInvertido=0;
        resto=0;
        cont=0;

        while(falta!=0)
        {
            cont++;
            if (posicion==cont) {

                resto = falta % 10;
                numeroInvertido = numeroInvertido * 10 + numero_nuevo;
                falta = falta / 10;

            }else{
                resto = falta % 10;
                numeroInvertido = numeroInvertido * 10 + resto;
                falta = falta / 10;
            }
        }


        resultado=0;
        falta=numeroInvertido;

        resto=0;
        cont=0;
        while(falta!=0)
        {
                resto = falta % 10;
                resultado = resultado * 10 + resto;
                falta = falta / 10;
        }
        System.out.println("Resultado: "+resultado);


    }

}
