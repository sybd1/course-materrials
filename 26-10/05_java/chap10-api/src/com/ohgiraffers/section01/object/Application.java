package com.ohgiraffers.section01.object;

public class Application {
    public static void main(String[] args) {

        /*
        * [API]
        * 프로그램을 만들 때 사용할 수 있도록 미리 제공되는 클래스와 메서드의 사용 규칙
        *
        * [Object]
        * 자바의 최상위 객체로서, 모든 클래스는 자동으로 Object 클래스를 상속한다.
        * 따라서 Object에 있는 메서드를 오버라이딩하여 사용할 수 있다.
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);

        // 자바가 book1을 문자열로 변경하기 위해 book1.toString()을 호출한다.
        // toString() 메서드 오버라이딩 하기 전: book1 = com.ohgiraffers.section01.object.Book@2f4d3709
        // toString() 메서드 오버라이딩 한 뒤: book1 = Book{number=1, title='홍길동전', author='허균', price=50000}
        /* Object.toString()의 기본 형식은 '클래스명@16진수 형태의 해시값' 이다.
        * 사람이 보기에 의미없는 정보이기 때문에 객체의 필드값을 보여주도록 오버라이딩 하여 사용. */
        System.out.println("book1 = " + book1);

        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        // equals() 메서드 오버라이딩 하기 전.
        // 동일성 비교(==) : false
        // 동등성 비교(equals) : false
        // equals() 메서드 오버라이딩 한 뒤.
        // 동일성 비교(==) : false
        // 동등성 비교(equals) : true
        System.out.println("동일성 비교(==) : " + (book2 == book3));
        /* Object.equals()의 기본 기능은 동일성 비교이다.
        * 하지만 서로 다른 객체라도 필드의 내용이 같으면 '같다(동등하다)'고 판단해야 할 때가 있다.
        * 이런 '동등성 비교'를 위해 equals()를 오버라이딩한다. */
        System.out.println("동등성 비교(equals) : " + (book2.equals(book3)));

    }
}
