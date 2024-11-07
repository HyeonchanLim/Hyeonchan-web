package com.green.datebase;

import java.sql.*;

// DB-Connection 을 만드는 공장
public class MyConnection {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        System.out.println("접속 성공!!");
        return conn;
    }
}

class MyConnectionTest {
    public static void main(String[] args) {
        try (Connection conn = MyConnection.getConn()) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
