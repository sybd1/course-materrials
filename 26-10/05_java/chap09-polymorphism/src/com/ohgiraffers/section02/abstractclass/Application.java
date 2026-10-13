package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /*
         * [추상 클래스]
         * 직접 객체를 생성할 수 없으며, 자식 클래스의 공통 기능을 정의하는 부모 클래스
         * */
//        Player player = new Player();

        Warrior warrior = new Warrior();
        warrior.attack();

        Wizard wizard = new Wizard();
        wizard.attack();

        // 다형성 적용
        Player[] players = new Player[2];
        players[0] = new Warrior();
        players[1] = new Wizard();

        for (Player player : players) {
            player.attack();
            player.levelUp();
        }
    }
}
