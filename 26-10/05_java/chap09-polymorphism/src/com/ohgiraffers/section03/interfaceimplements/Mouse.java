package com.ohgiraffers.section03.interfaceimplements;

public class Mouse implements IConnectable {
    @Override
    public void connect() {
        System.out.println("마우스가 usb 포트에 연결 되었습니다.");
    }

    @Override
    public void disconnect() {
        System.out.println("마우스 연결을 해제합니다.");
    }
}
