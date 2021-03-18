package Tarea2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String[] args ) throws ClassNotFoundException {
        //Scanner sc = new Scanner(System.in);
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos4.dat"));

            double tabla[] = (double[]) in.readObject();

            System.out.println(Arrays.toString(tabla));
        }

        catch (IOException ex) {
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
