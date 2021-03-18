package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos4.dat"));

            try {
                while (true) {
                    System.out.println(in.readDouble());
                }

            } catch (EOFException ex) {
            }
        }catch (IOException ex) {
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
