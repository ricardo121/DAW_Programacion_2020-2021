package Ejercicio4;

import java.sql.*;
import java.util.*;


public class Transaciones {


    private static Connection c = ConexionBD.getConnection();


    public static void insertProduct(Products p1){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,p1.getProductCode());
            preparedStatement.setString(2,p1.getProductName());
            preparedStatement.setString(3,p1.getProductLine());
            preparedStatement.setString(4,p1.getProductScale());
            preparedStatement.setString(5,p1.getProductVendor());
            preparedStatement.setString(6,p1.getProductDescription());
            preparedStatement.setInt(7,p1.getQuantityInStock());
            preparedStatement.setDouble(8,p1.getBuyPrice());
            preparedStatement.setDouble(9,p1.getMSRP());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public static void insertarProductLine(Productlines dp1){
        try{
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO productlines VALUES (?,?,?,?)");
            preparedStatement.setString(1,dp1.getProductLine());
            preparedStatement.setString(2,dp1.getTextDescription());
            preparedStatement.setString(3,dp1.getHtmlDescription());
            preparedStatement.setString(4,dp1.getImage());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void InsertarLineaProducto(){
        try {
            c.setAutoCommit(false);
            insertarProductLine(new Productlines("Class","2004-05-2", "2003-01-13", "NULL"));

            System.out.println("Se ha insertado correctamente");


            insertProduct(new Products("1","pe", "Class", "1:10","pedro","NULL ", 30,20.30,40.30));

            insertProduct(new Products("2","lapiz", "Class", "1:10","jose","NULL ", 60,40.36,80.60));

            c.commit();
        } catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (c!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    c.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }

        }

    }
    
}
