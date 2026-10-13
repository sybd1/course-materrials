package com.ohgiraffers.section02.superkeyword;

public class Computer extends Product {

    private String cpu;
    private int ram;

    public Computer() {
        super();
        System.out.println("Computer 기본 생성자 호출");
    }

    // 부모와 자식 필드를 모두 초기화 하는 생성자
    public Computer(String code, String name, int price, String cpu, int ram) {
        super(code, name, price);
        this.cpu = cpu;
        this.ram = ram;
        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getInformation() {
        String parentInfo = super.getInformation();
        String computerInfo = " " + cpu + " " + ram;
        return parentInfo + computerInfo;
    }
}
