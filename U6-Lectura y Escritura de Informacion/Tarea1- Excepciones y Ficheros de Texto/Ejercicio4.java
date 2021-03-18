package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        final String fichero_defecto = "C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\Prueba4.txt";
        int contador = 0;

        System.out.println("Escriba nombre de fichero:");


        try {

            BufferedReader f = new BufferedReader(new FileReader(fichero_defecto));

            int c = f.read();
            while (c != -1) {
                System.out.print((char) c);
                c = f.read();
                contador++;
            }
            f.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }
        System.out.println("");
        System.out.println("Caracteres: " + contador);

    }

}
