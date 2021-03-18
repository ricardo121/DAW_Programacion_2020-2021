package Tarea1;

import java.util.*;

public class Ejercicio6 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        Set<String> nombres = new LinkedHashSet<>();
        System.out.println("ntroducir nombre(\"fin\" para terminar): ");
        String temp = sc.nextLine();

        while(!temp.equalsIgnoreCase("fin")){
            nombres.add(temp);
            System.out.println("Introducir nombre: ");
            temp = sc.nextLine();
        }
        System.out.println("Lista de nombres sin repetidos:\n "+ nombres );
    }

}
