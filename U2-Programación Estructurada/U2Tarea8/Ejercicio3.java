
import java.util.Scanner;

public class Ejercicio3 {

    /*Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo.
    El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
    El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).*/

    public static void main( String args[] ) {

        int numero_aleatorio , numero_entrada;

        numero_aleatorio= (int)(Math.random()*100+1);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu numero: ");
        numero_entrada = teclado.nextInt();

        while (numero_entrada != -1 && numero_entrada != numero_aleatorio  ) {
            if (numero_aleatorio<numero_entrada){
                System.out.println("El Numero es Menor");
            }else{
                System.out.println("El Numero es Mayor");
            }

            System.out.print("Intentalo Otra Vez: ");
            numero_entrada = teclado.nextInt();
        }

        if (numero_entrada == numero_aleatorio && numero_entrada != -1  ) {
            System.out.println("Ha Ganado!");
        }
        else{
            System.out.println("Se ha Rendido!");
        }
    }

}
