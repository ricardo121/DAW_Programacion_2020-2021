import java.util.Scanner;

public class Ejercicio5 {

    /*Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases
    con "Javalín, javalón", para después hacer una pausa más o menos larga (la pausa se representa mediante
    espacios en blanco) y a continuación expresan el mensaje. Existe un dialecto que no comienza sus
    frases con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado
    y la coletilla "javalén, len, len". Se pide diseñar un traductor que, en primer lugar, nos diga si
    la frase está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
    nos muestre el mensaje sin muletillas.*/

    public static void main(String args[]) {

        int longitud ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca frase: ");
        String frase = teclado.nextLine();
        longitud = frase.length();

        String muletilla1 = frase.substring(0 , 20);
        String muletilla2 = frase.substring(longitud-20, longitud);

        String muletilla3 = "Javalín, javalón    ";
        String muletilla4 = "   javalén, len, len";

        String resultado1 = frase.substring(20 , longitud);
        String resultado2 = frase.substring(0 , longitud-20);

        if (muletilla1.equals(muletilla3)) {
            System.out.println("Idioma de Javalandia");
            System.out.println(resultado1);
            //System.out.println(muletilla1);

        }else if(muletilla2.equals(muletilla4)) {
            System.out.println("Idioma de Javalandia");
            System.out.println(resultado2);
            //System.out.println(muletilla2);

        }else {
            System.out.println("No es el idioma de Javalandia ");
        }

    }

}
