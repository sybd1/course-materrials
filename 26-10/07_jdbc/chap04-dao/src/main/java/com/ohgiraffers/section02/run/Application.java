package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.model.dao.MenuDAO;
import com.ohgiraffers.section02.model.dto.CategoryDTO;
import com.ohgiraffers.section02.model.dto.MenuDTO;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        Connection con = getConnection();
        MenuDAO menuDAO = new MenuDAO();

        /* 1. 카테고리 조회 */
        List<CategoryDTO> categoryList = menuDAO.selectAllCategory(con);

        System.out.println("===== 등록 가능한 카테고리 =====");
        for(CategoryDTO categoryDTO : categoryList) {
            System.out.println(categoryDTO.getCategoryCode() + " : " + categoryDTO.getCategoryName());
        }

        /* 2. 신규 메뉴 등록 */
        /* 2-1. 신규 메뉴 등록을 위한 정보 입력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 메뉴의  이름을 입력하세요 : ");
        String menuName = sc.nextLine();
        System.out.print("신규 메뉴의 가격을 입력하세요 : ");
        int menuPrice = sc.nextInt();
        System.out.print("카테고리 코드를 선택해주세요 : ");
        int categoryCode = sc.nextInt();
        System.out.print("바로 판매 메뉴에 적용하시겠습니까?(예/아니오) : ");
        sc.nextLine();
        String answer = sc.nextLine();

        /* 2-2. 신규 메뉴 등록을 위한 값 가공 */
        String orderableStatus = answer.equals("예") ? "Y" : "N";

        /* 2-3. 신규 메뉴 등록을 위한 메소드 호출 */
        MenuDTO newMenu = new MenuDTO(menuName, menuPrice, categoryCode, orderableStatus);
        int result = menuDAO.insertNewMenu(con, newMenu);

        if(result > 0) {
            System.out.println("신규 메뉴 등록 완료!");
        } else {
            System.out.println("신규 메뉴 등록 실패ㅠㅠ");
        }

        /* connection 종료 */
        close(con);

    }
}
