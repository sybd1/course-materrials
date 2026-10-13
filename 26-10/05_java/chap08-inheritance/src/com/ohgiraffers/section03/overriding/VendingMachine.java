package com.ohgiraffers.section03.overriding;

public class VendingMachine {

    public String vend() {
        return "밀크 커피";
    }
    // private 메서드: 선언한 클래스 내부에서만 사용할 수 있으므로 오버라이딩 불가.
    private void checkStock() {
        System.out.println("자판기 재고를 확인합니다.");
    }
    // final 메서드: 재정의(오버라이딩) 금지, 호출은 가능.
    // 모든 자식이 같은 규칙을 반드시 사용해야 한다는 의도 표현
    public final void powerOn() {
        System.out.println("자판기 전원을 켭니다.");
    }

    // protected 메서드
    protected void clean() {
        System.out.println("자판기 내부를 청소합니다.");
    }
}
