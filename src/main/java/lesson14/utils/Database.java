package lesson14.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc: postgresql://localhost:5452/wrong_db";
    private static final String USERNAME = "postgres_wrong";
    private static final String PASSWORD = "postgres_wrong";

    public static Connection getConnection (){
        Connection connection = null;
        try {
            Class.forName("org.postrgesql.Driver");
            DriverManager.getConnection(URL,USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
