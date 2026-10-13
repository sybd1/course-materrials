package com.ohgiraffers.section02.superkeyword;

// Product 클래스를 상속받는다
public class SmartPhone extends Product {

    // 스마트폰만의 통신사(agency) 필드를 추가
    public String agency;

    // 부모 필드 포함 모든 필드를 초기화 하는 생성자
    public SmartPhone(String code, String name, int price, String agency) {
        super(code, name, price);
        this.agency = agency;
    }

    // getInformation() 메서드 오버라이딩
    @Override
    public String getInformation() {
        String parentInfo = super.getInformation();
        String childrenInfo = " " + agency;
        return parentInfo + childrenInfo;
    }
}
