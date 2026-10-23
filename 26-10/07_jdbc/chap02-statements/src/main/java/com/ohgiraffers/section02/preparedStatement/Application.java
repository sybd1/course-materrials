package com.ohgiraffers.section02.preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 메뉴 번호를 입력하세요: ");
        String menuCode = sc.nextLine();
        /* ?: 위치 홀더 */
        String query = "SELECT MENU_NAME, MENU_PRICE FROM TBL_MENU WHERE MENU_CODE = ?";

        try {
            pstmt = con.prepareStatement(query);
            // sql 위치홀더 설정
            pstmt.setString(1, menuCode);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                System.out.println(rset.getString("MENU_NAME") + ", "
                + rset.getInt("MENU_PRICE"));
            } else {
                System.out.println("해당 메뉴의 조회 결과가 없습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
    }
}
