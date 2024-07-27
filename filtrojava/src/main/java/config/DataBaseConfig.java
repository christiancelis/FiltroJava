package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConfig {

    public static Connection getConnection() throws SQLException {
        // String url = "jdbc:mysql://localhost:3306/sgpzf";
        // String user = "campus2023"; 
        // String password = "campus2023"; 
        
        String url = "jdbc:mysql://localhost:3306/sgpzf";
        String user = "root"; 
        String password = "123456"; 
        return DriverManager.getConnection(url, user, password);
    }
}

