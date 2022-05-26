package Ejercicio3;

import com.google.gson.Gson;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        Consultas c = new Consultas();
        System.out.println(c.MostrarEmpleados());



        Gson gson = new Gson();

        String jsonString = gson.toJson(c.MostrarEmpleados());
        System.out.println(jsonString);
        System.out.println();
        Employee[] j = gson.fromJson(jsonString, Employee[].class);
        System.out.println(Arrays.toString(j));

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        //System.out.println(adc.getOffice());

    }

}
