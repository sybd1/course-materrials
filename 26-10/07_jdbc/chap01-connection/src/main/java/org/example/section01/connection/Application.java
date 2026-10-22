package org.example.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {

        /*
        * Connection
        * - 자바 어플리케이션과 DB사이에 만들어지는 연결통로
        * - DriverManager를 통해 DB 접속 정보를 전달하면 Connection 객체를 얻을 수 있다.
        * */

        Connection con = null;

        // 사용할 JDBC Driver 클래스를 로딩한다.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.getConnection(url, user, password)
            con = DriverManager.getConnection("jdbc:mysql://localhost/menudb", "ohgiraffers", "ohgiraffers");

            System.out.println(con);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    if (!con.isClosed()) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
