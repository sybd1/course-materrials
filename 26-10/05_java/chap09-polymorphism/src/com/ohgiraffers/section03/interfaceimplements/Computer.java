package com.ohgiraffers.section03.interfaceimplements;

public class Computer {

    public void connectDevice(IConnectable device) {
        System.out.println("컴퓨터의 usb 포트에 장치를 연결합니다.");
        device.connect();
    }

    public void disconnectDevice(IConnectable device) {
        System.out.println("컴퓨터의 usb 포트에서 장치 연결을 해제합니다.");
        device.disconnect();
    }
}
