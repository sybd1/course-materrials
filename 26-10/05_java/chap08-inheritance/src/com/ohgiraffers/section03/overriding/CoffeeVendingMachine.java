package com.ohgiraffers.section03.overriding;

public class CoffeeVendingMachine extends VendingMachine {

    /*
     * 오버라이딩 성공 조건:
     * 메서드 이름과 매개변수 목록이 부모와 동일해야 한다.
     * 반환 타입도 부모와 동일하게 작성하는 것이 기본이다. (부모 반환 타입의 자식타입이라면 가능)
     * 접근 제한자는 부모와 같거나 더 넓어야 한다.
     * ( private < default < protected < public )
     *
     * 오버라이딩 불가 대상:
     * 1. private 메서드(자식에게 보이지 않음)
     * 2. final 메서드(변경이 금지됨)
     * 3. 생성자 (상속되지 않음)
     * */

    @Override
    public String vend() {
        return "아이스 아메리카노";
    }

    // 더 넓은 범위로의 접근 제한자는 오버라이딩 가능
    @Override
    public void clean() {
        System.out.println("내부를 스팀으로 청소합니다.");
    }

    /* 오버라이딩 불성립 */

    // 이름이 일치하지 않을 때
//    @Override
//    public String vendMachine() {
//        return "아이스 아메리카노";
//    }

    // 반환형이 다른 경우
//    @Override
//    public int vend() {
//        return 3;
//    }

    // 매개변수가 다른 경우
//    @Override
//    public String vend(String type) {
//        return type;
//    }

    // private 메서드
//    @Override
//    private void checkStock() {
//        System.out.println("자판기 재고를 확인합니다.");
//    }

    // final 메서드
//    @Override
//    public final void powerOn() {}

    // 접근 범위 축소
//    @Override
//    void clean() {}
}
