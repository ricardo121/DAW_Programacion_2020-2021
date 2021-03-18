package Tarea2;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio8 {

    public static void main( String[] args ) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        int tabla[] = new int[10];

        try {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos8.dat"));

            System.out.println("Cantidad de n numeros doubles:");

            for (int i = 0; i < tabla.length; i++) {
                System.out.println("Introducir un numero Double :");
                tabla[i] = (int) (Math.random() * 100);
            }
            Arrays.sort(tabla);
            out.writeObject(tabla);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos8.dat"));

            try {
                System.out.println("Contenido de fichero binario: ");
                tabla = ((int[]) in.readObject());

            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println(Arrays.toString(tabla));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }


    }

}