import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        long numero,posicion,resultado1,resultado2;
        long numeroinsert;
        long falta,numeroInvertido,resto;
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo:  ");
        numero = teclado.nextLong();

        System.out.print("Introduzca la posición dentro del número: ");
        posicion = teclado.nextLong();

        System.out.print("Introduzca el nuevo dígito ");
        numeroinsert = teclado.nextLong();


        while(numero<=0);
        falta=numero;
        numeroInvertido=0;
        resto=0;
        cont=0;


        while(falta!=0)
        {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }


        resultado1=0;
        resultado2=0;
        falta=numeroInvertido;

        resto=0;
        cont=0;

        while(falta!=0)
        {
            cont++;

            resto = falta % 10;
            resultado2 = resultado2 * 10 + resto;
            falta = falta / 10;

            if (posicion-1==cont) {
                resto = falta % 10;
                resultado2 = resultado2 * 10 + numeroinsert;
                falta = falta / 10;
            }

        }

        System.out.println("El número resultante es: "+resultado2  );

    }

}
