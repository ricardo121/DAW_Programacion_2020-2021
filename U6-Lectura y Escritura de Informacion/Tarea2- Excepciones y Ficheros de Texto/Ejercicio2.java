package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos.dat"));
            System.out.println("Inserte un numero real:");
            double x = in.readDouble();
            System.out.println("x: " + x);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}
