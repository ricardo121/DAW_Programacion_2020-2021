package Tarea2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        int contador = 0;

        try {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos2.dat"));
            System.out.println("Introducir un numero entero positivo:");
            int x = sc.nextInt();

            while( x >= 0){
                contador++;
                out.writeInt(x);
                System.out.println("Introducir un numero entero positivo:");
                x = sc.nextInt();
            }

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
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos2.dat"));
            System.out.println("Estos son los Numero enteros positivos del datos2.data: ");

            for (int i = 0; i < contador; i++) {
                int x = in.readInt();
                System.out.println("x: " + x);
            }


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
