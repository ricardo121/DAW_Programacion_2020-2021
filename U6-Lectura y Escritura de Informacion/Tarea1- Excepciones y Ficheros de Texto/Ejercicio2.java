package Tarea1;

import java.io.*;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        final String fichero_defecto = "C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\Prueba1.txt";

        System.out.println("Escriba su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Escriba su edad: ");
        String edad = sc.nextLine();


        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\Prueba2.txt"));

            f.write("Nombre" + nombre);
            f.newLine();
            f.write("Edad" + edad);

            f.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
