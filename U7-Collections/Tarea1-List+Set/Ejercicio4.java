package Tarea1;

import java.util.*;

public class Ejercicio4 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir Frase: ");
        String frase = sc.nextLine();
        String palabras[] = frase.split("");


        List<String> listaPalabras = new ArrayList<>();

        for (String p : palabras) {
            listaPalabras.add(p);
        }
        Set<String> palabrasRepe = new LinkedHashSet<>();
        List<String> aux = new ArrayList<>(listaPalabras);
        while(aux.size() > 0){
            String temp = aux.remove(0);
            if(aux.contains(temp)){
                palabrasRepe.add(temp);
            }
        }
        System.out.println("Palabras Repetidas:\n "+ palabrasRepe );
        aux = new ArrayList<>(listaPalabras);
        aux.removeAll(palabrasRepe);
        System.out.println("\nPalabras no Repetidas:\n "+ aux );
    }


}
