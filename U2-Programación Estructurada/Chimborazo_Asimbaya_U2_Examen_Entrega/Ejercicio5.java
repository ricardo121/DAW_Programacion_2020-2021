import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String args[]) {

        int longitud ;
        int i;
        int contador=0;

        String vocal1="aáAÁ" ;

        String vocal2="eéEÉ" ;

        String vocal3="oóOÓ" ;

        String vocal4="hH" ;

        String vocal5=" " ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca frase: ");
        String frase = teclado.nextLine();
        longitud = frase.length();

        for ( i = 0; i < longitud ; i++){
            char co = frase.charAt(i);

            if (vocal1.charAt(0)==co ||vocal1.charAt(1)==co||vocal1.charAt(2)==co||vocal1.charAt(3)==co){
                contador=contador+1;

            }else if (vocal2.charAt(0)==co ||vocal2.charAt(1)==co||vocal2.charAt(2)==co||vocal2.charAt(3)==co){
                contador=contador+1;

            }else if (vocal3.charAt(0)==co ||vocal3.charAt(1)==co||vocal3.charAt(2)==co||vocal3.charAt(3)==co){
                contador=contador+1;

            }else if (vocal4.charAt(0)==co ||vocal4.charAt(1)==co){
                contador=contador+1;

            }else if (vocal5.charAt(0)==co){
                contador=contador+1;

            }

            //System.out.print(co);
        }
        System.out.println("La cantidad de espacios, haches y vocales abiertas es");
        System.out.print(contador);

    }




}
