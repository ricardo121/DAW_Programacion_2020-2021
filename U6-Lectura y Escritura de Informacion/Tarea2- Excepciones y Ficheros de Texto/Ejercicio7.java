package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main( String[] args ) throws ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos7.dat"));
            System.out.println("Escriba una frase:  ");
            String frase = sc.nextLine();
            out.writeObject(frase);


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
        // In del Programa
        try {
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos7.dat"));
            System.out.println("Contenido de fichero binario: ");
            System.out.println((String) in.readObject());


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
