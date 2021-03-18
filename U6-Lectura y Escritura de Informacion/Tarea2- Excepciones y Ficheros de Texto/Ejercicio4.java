package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos4.dat"));

            System.out.println("Cantidad de n numeros doubles:");
            int n = sc.nextInt();
            double tabla[] = new double[n];

            for (int i = 0; i < tabla.length; i++) {
                System.out.println("Introducir un numero Double :");
                tabla[i] = sc.nextDouble();
            }
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

    }
}
