package Tarea1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num,max,min;

        final String fichero_defecto = "C:\\Users\\Ricardo\\IdeaProjects\\U6\\Tarea1\\numeros.txt";
        BufferedReader f = new BufferedReader(new FileReader(fichero_defecto));

        String cifra = f.readLine();
        num = Integer.valueOf(cifra);
        max = num;
        min = num;
        cifra = f.readLine();

        while (cifra != null) {
            num = Integer.valueOf(cifra);
            if (num > max){
                max=num;
            }
            if (num < min){
                min=num;
            }
            cifra = f.readLine();
        }
        f.close();

        int contador = 0;

        System.out.println("Mayor:"+ max);
        System.out.println("Mayor:"+ min);



    }

}
