package com.library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url="jdbc:mysql://localhost:3306/LibraryDB";
    private static final String user= "root";
    private static final String password ="Dp6091154@";

    public static Connection getConnection(){

        Connection con = null;
        try{
            con= DriverManager.getConnection(url,user,password);
            System.out.println("Database Connected Successfully");

        }
        catch(SQLException e){
            System.out.println(e);

        }
        return con;
    }


}
