package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {


    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        final String fichero_defecto = "C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\Original.txt";

        System.out.println("Solucion A:");


        try {
            BufferedReader in = new BufferedReader(new FileReader(fichero_defecto));
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\Copia.txt"));

            int c = in.read();
            while (c != -1) {
                out.write((char) c);
                c = in.read();
            }
            out.newLine();
            in.close();
            out.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }

    }


}
