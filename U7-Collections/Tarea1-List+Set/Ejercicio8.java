package Tarea1;

import java.util.*;

public class Ejercicio8 {

    static List eliminaRepetidos(List c){
        Set temp = new LinkedHashSet<>(c);
        return new ArrayList(temp);
    }

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        System.out.println("Introducir nombre(\"fin\" para terminar): ");
        String temp = sc.nextLine();

        while(!temp.equalsIgnoreCase("fin")){
            lista.add(temp);
            System.out.println("Introducir nombre: ");
            temp = sc.nextLine();
        }
        System.out.println("Lista Original: ");
        System.out.println(lista);

        System.out.println("Sin repetidos: ");
        lista = eliminaRepetidos(lista);
        System.out.println(lista);
    }

}

