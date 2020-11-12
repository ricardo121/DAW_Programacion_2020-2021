import java.util.Scanner;

public class Ejercicio5 {


        public static void main(String args[]) {

            int longitud ;
            int i;
            int cont=0;

            String vocal1="aáAÁ" ;

            String vocal2="eéEÉ" ;

            String vocal3="iíIÍ" ;

            String vocal4="oóOÓ" ;

            String vocal5="uúUÚ " ;

            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduzca frase: ");
            String frase = teclado.nextLine();
            longitud = frase.length();

            for ( i = 0; i < longitud ; i++){
                char co = frase.charAt(i);

                if (vocal1.charAt(0)==co ||vocal1.charAt(1)==co||vocal1.charAt(2)==co||vocal1.charAt(3)==co){
                    cont=cont+1;

                }else if (vocal2.charAt(0)==co ||vocal2.charAt(1)==co||vocal2.charAt(2)==co||vocal2.charAt(3)==co){
                    cont=cont+1;

                }else if (vocal3.charAt(0)==co ||vocal3.charAt(1)==co||vocal3.charAt(2)==co||vocal3.charAt(3)==co){
                    cont=cont+1;

                }else if (vocal4.charAt(0)==co ||vocal4.charAt(1)==co||vocal4.charAt(2)==co||vocal4.charAt(3)==co){
                    cont=cont+1;

                }else if (vocal5.charAt(0)==co){
                    cont=cont+1;

                }

            }
            System.out.println("La cantidad de vocales: ");
            System.out.print(cont);

        }

    }

