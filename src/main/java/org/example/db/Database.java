package org.example.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class Database {
    private static final String DB_URL = "jdbc:h2:~/test";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "";
    private static Connection connection;

    public Database(){

    }

    public static String getDbUrl(){
        return DB_URL;
    }
    public static String getUsername(){
        return USERNAME;
    }
    public static String getPassword(){
        return PASSWORD;
    }
    public static Connection getConnection() throws SQLException {
        if(Objects.isNull(connection)){
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }
        return connection;
    }
}
