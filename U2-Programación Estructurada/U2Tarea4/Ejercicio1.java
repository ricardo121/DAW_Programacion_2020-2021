
public class Ejercicio1 {

    public static void main( String args[] ) {

        /* El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Realiza
        un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
        Es decir, que muestre el valor máximo de una variable de tipo short, y muestre también
        qué ocurre si sumamos 1 a
        esa variable.*/

        short x = 32767  , y = 1  , z ;

        System.out.print( "Valor máximo de una variable de tipo short: " );
        System.out.println( x );

        System.out.print( "Valor máximo de una variable de tipo short + 1: " );
        z = (short)(x+y) ;
        System.out.println( z );
    }

}






