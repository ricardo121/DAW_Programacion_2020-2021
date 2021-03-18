package Tarea2;

import java.io.*;;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea2\\datos.dat"));
            System.out.println("Inserte un numero real:");
            double x = sc.nextDouble();
            out.writeDouble(x);

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
