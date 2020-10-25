

public class Ejercicio7 {

    /*Diseñar un programa que muestre el producto de los 10 primeros números impares.*/

    public static void main( String args[] ) {
        double n = 1;

        for ( int i = 1 ; i< 20 ; i +=2 ) {

            n = n * i;
        }
        System.out.println("El producto de los 10 primeros numeros impares es :" + n );
    }

}
