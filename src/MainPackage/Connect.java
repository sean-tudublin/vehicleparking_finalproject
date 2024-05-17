package MainPackage;

import java.sql.*;

public class Connect {

    public static Connection mycon(){
        Connection con = null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Username and password
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/vehicleparkingDB","sean","1234"); 
        System.out.println("Database connected");
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
