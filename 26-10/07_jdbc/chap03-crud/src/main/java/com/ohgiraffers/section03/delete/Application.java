package com.ohgiraffers.section03.delete;

import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        /* 메뉴 코드를 입력받아 해당 메뉴 삭제하기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 메뉴 코드를 입력하세요 : ");
        int menuCode = sc.nextInt();

        MenuDTO deleteMenu = new MenuDTO();
        deleteMenu.setCode(menuCode);

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try (FileInputStream queryStream = new FileInputStream(
                "src/main/java/com/ohgiraffers/mapper/menu-query.xml")) {
            prop.loadFromXML(queryStream);
            String query = prop.getProperty("deleteMenu");

            pstmt = con.prepareStatement(query);

            pstmt.setInt(1, menuCode);

            result = pstmt.executeUpdate();

            pstmt = con.prepareStatement(query);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }
        if (result > 0) {
            System.out.println("메뉴 삭제 성공!");
        } else {
            System.out.println("메뉴 삭제 실패!");
        }
    }
}