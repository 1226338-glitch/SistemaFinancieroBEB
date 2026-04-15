package com.sistemasfinancieros.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Change to your database URL
    private static final String USERNAME = "your_username"; // Change to your database username
    private static final String PASSWORD = "your_password"; // Change to your database password
    private static Connection connection = null;

    // Static block for loading the Oracle JDBC driver.
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Oracle JDBC Driver not found. Include it in your library path.");
        }
    }

    // Method to get a connection to the database.
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return connection;
    }

    // Method to close the connection.
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection = null;
            }
        }
    }
}