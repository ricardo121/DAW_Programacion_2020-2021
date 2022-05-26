package Ejercicio3;


import com.google.gson.Gson;
import java.sql.*;
import java.util.*;

public class Consultas {



    public static List<Employee> MostrarEmpleados() {


        Connection c = ConexionBD.getConnection();
        List<Employee> listaOffices = new ArrayList<>();
        try {



            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un código de oficina: ");
            Double cn = sc.nextDouble();

            //String query = "select * from products where customerNumber="+cn;
            String sql = "select * from employees where officeCode = ? ";
            PreparedStatement statement = c.prepareStatement(sql);

            //Establezco los parámetros
            statement.setDouble(1,cn);

            //Mostrar la consulta
            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                Employee e = new Employee(rs.getInt("employeeNumber"),rs.getString("lastName"),rs.getString("firstName"),rs.getString("extension"),rs.getString("email"),rs.getString("officeCode"),rs.getInt("reportsTo"),rs.getString("jobTitle"));
                listaOffices.add(e);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaOffices;
    }

}
