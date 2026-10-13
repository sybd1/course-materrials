package com.ohgiraffers.section03.overriding;

public class Application {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachine();

        System.out.println(vendingMachine.vend());
        System.out.println(coffeeVendingMachine.vend());
        coffeeVendingMachine.clean();
        coffeeVendingMachine.powerOn();


    }
}
