package hibernate.jdbc;

import java.sql.*;

public class Testjdbc {

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-05-many-to-many ?useSSL=false";
        String user = "hbstudent";
        String password = "hbstudent";
        System.out.println("trying to connect");
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        System.out.println("already connect");


    }
}
