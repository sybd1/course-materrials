package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        /*
         * [다형성]
         * 하나의 부모 타입으로 여러 자식 객체를 다룰 수 있다.
         *
         * 부모 타입 참조 변수로 자식 객체를 참조할 수 있다.
         * 부모타입 변수 = new 자식클래스();
         *
         * [동적 바인딩]
         * 컴파일 시: 부모 타입의 멤버만 접근 가능
         * 실행(Runtime)시 : 오버라이딩된 자식 메소드가 실행됨
         * 자식 고유 멤버 사용 시 다운캐스팅 필요
         * */

        ZooKeeper zooKeeper1 = new ZooKeeper();

        zooKeeper1.feed(new Rabbit());
        zooKeeper1.feed(new Tiger());

        // 다형성 적용(업캐스팅) 후
        // 업캐스팅 - 자식 객체의 참조값을 부모 타입 변수에 저장
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        /*
        * [동적 바인딩]
        * 컴파일 시점에는 부모의 메서드를 호출하는 것으로 보이지만,
        * 실행 시점(Runtime)에는 참조 변수가 실제로 가리키는 객체(Rabbit,Tiger)의
        * 오버라이딩 된 메서드가 실행되는 원리이다. */
        a1.cry();
        a2.cry();

//        a1.jump();    // 부모타입으로는 자식만의 고유 기능은 접근 불가
        ((Rabbit) a1).jump();   // 다운캐스팅
//        ((Rabbit) a2).jump(); // a2의 실제 객체는 Tiger이기 때문에 Rabbit으로 형변환 불가

        /* 다운캐스팅 전에 instanceof 연산자로 가리키는 객체를 확인하는 것이 안전*/
        System.out.println("a1은 Tiger 타입인가? " + (a1 instanceof Tiger));

        if (a1 instanceof Rabbit) {
            ((Rabbit)a1).jump();
        }

        /* 다형성을 활용한 객체 배열 */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (Animal animal : animals) {
            animal.cry();
        }

        for (Animal animal : animals) {
            if (animal instanceof Rabbit) {
                ((Rabbit)animal).jump();
            } else if (animal instanceof Tiger) {
                ((Tiger)animal).bite();
            }
        }

        ZooKeeper zooKeeper2 = new ZooKeeper();

        for (Animal animal : animals) {
            zooKeeper2.feed(animal);
        }
    }
}
