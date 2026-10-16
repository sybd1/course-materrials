package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(30000, -50000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println(e.getClass().getSimpleName() + " 발생!!" + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getClass().getSimpleName() + " 발생!!" + e.getMessage());
        } catch (Exception e) {
            /* Exception은 위 예외들의 부모 타입이므로 반드시 마지막에 작성한다
            * 앞에서 구체적으로 분류하지 못한 예외를 처리하는 마지막 catch이다. */
            e.printStackTrace();
        } finally {
            /* 성공 여부와 관계없이 finally가 실행된다.
            * 반드시 수행해야 하는 마무리 작업을 작성할 수 있다. */
            System.out.println("구매 가능 여부 확인을 마칩니다.");
        }

        System.out.println("프로그램을 정상 종료합니다!");
    }
}
