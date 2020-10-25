import java.util.Scanner;

public class Ejercicio3 {

    /*En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
    según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.*/

    public static void main( String args[] ) {


        int longitud ;
        String password , palabra;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Acierta la contraseña ");
        System.out.print("Introduce una contraseña: ");
        password = teclado.next();
        longitud = password.length();
        char primera = password.charAt(0);
        char ultima = password.charAt(longitud -1);


        System.out.println(">Pistas : ");

        System.out.print("Numero de Caracteres : ");
        System.out.println(longitud);

        System.out.print("Primera Letra : ");
        System.out.println(primera);

        System.out.print("Ultima Letra : ");
        System.out.println(ultima);

        System.out.print("Introduce la contraseña : ");


        do {
            palabra = teclado.next();
            int comparacion = password.compareTo(palabra);
            if (comparacion == 0){
                System.out.println("Acertaste!!");
            }
            else if (comparacion < 0){
                System.out.println("Fallaste!!");
                System.out.println("La contraseña es menor ");
                System.out.println("Intentalo de Nuevo : ");
            }
            else {
                System.out.println("Fallaste!!");
                System.out.println("La contraseña es mayor ");
                System.out.println("Intentalo de Nuevo : ");
            }

        } while (!password.equals(palabra)); {

        }


    }

}
