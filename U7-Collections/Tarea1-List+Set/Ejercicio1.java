package Tarea1;

import java.util.*;

public class Ejercicio1 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList <>();
        Integer temp;
        for (int i= 0 ; i<20 ;i++) {
            temp = (int)(Math.random() * 100);
            lista.add(temp);
        }
            System.out.println("Lista con el orden de insercion: ");
            System.out.println(lista);
            Collections.sort(lista);
            System.out.println("Lista en el orden creciente: ");
            System.out.println(lista);
        }


}


