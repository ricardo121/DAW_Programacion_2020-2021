package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        final String fichero_defecto = "C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\Prueba1.txt";

        System.out.println("Escriba nombre de fichero:");
        String nombreFichero = sc.nextLine();

        if (nombreFichero.isEmpty()){

            nombreFichero = fichero_defecto;

        }
        try {
            BufferedReader f = new BufferedReader(new FileReader(nombreFichero));

            int c = f.read();
            while (c != -1) {
                System.out.print((char) c);
                c = f.read();
            }
            f.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }

}
