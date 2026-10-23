package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {

        // Connection 생성
        Connection con = getConnection();

        // Statement 생성
        Statement stmt = null;

        // ResultSet 생성
        ResultSet rset = null;

        try {
            stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.print("메뉴 번호를 입력하세요: ");
            String menuCode = sc.nextLine();

            // WHERE MENU_CODE = '" + menuCode + "'
            String query = "SELECT MENU_NAME, MENU_PRICE FROM TBL_MENU WHERE MENU_CODE = '" + menuCode + "'";

            System.out.println(query);

            rset = stmt.executeQuery(query);

            if (rset.next()) {
                System.out.println(rset.getString("MENU_NAME") + ", "
                + rset.getInt("MENU_PRICE"));
            } else {
                System.out.println("해당 메뉴의 조회 결과가 없습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
