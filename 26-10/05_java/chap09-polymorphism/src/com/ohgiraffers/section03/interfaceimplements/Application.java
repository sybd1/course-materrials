package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        Computer computer = new Computer();

        computer.connectDevice(keyboard);
        computer.connectDevice(mouse);

        computer.disconnectDevice(keyboard);
        computer.disconnectDevice(mouse);
    }
}
