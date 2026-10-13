package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product("S-1234", "갤럭시", 2300000);
        System.out.println(product2.getInformation());

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("C-123", "컴퓨터", 2500000, "i5", 32);
        System.out.println(computer2.getInformation());

        SmartPhone smartPhone = new SmartPhone("S-123", "갤럭시", 1000000, "SKT");
        System.out.println(smartPhone.getInformation());
    }
}
