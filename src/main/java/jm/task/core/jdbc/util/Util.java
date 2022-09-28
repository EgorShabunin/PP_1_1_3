package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static final String HOST = "jdbc:mysql://localhost:3306/pp113";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;

    public Util() {
        try {
            if(connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
                System.out.println("ok, connect");
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}

