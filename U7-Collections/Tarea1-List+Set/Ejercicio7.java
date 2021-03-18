package Tarea1;

import java.util.*;

public class Ejercicio7 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        Set<String> nombres = new TreeSet<String>();
        System.out.println("Introducir nombre(\"fin\" para terminar): ");
        String temp = sc.nextLine();

        while(!temp.equalsIgnoreCase("fin")){
            nombres.add(temp);
            System.out.println("Introducir nombre: ");
            temp = sc.nextLine();
        }
        System.out.println("Datos ordenados alfabeticamente,  sin repetidos:\n "+ nombres );
    }

}
