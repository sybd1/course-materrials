package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        System.out.println("가지고 계신 돈은 " + money + "입니다.");

        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeException("가진 돈이 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new NotEnoughMoneyException("돈이 부족합니다.");
        }
        System.out.println("아쟈스! 즐거운 쇼핑 하세요~~~");
    }
}
