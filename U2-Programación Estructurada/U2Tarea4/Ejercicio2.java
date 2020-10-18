public class Ejercicio2 {

    public static void main( String args[] ) {

        /*Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
        Hay que tener en cuenta que la media puede contener decimales.*/

        float x = 4  , y = 5  , z ;

        System.out.print( "Primera Nota " );
        System.out.println( x );

        System.out.print( "Segunda Nota " );
        System.out.println( y );

        System.out.print( "Media " );
        z = (float)(x+y) ;
        z = z/2 ;
        System.out.println( z );
    }

}
