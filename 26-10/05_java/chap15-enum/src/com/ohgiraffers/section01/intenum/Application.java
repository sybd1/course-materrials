package com.ohgiraffers.section01.intenum;

public class Application {
    public static void main(String[] args) {

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        printSubject(Subjects.MYSQL);
        printSubject(2);
        printSubject(100);
    }
    public static void printSubject(int subjectNumber) {
        String subject = "";
        switch (subjectNumber) {
            case Subjects.JAVA: subject = "JAVA";
                break;
            case Subjects.MYSQL: subject = "MYSQL";
                break;
            case Subjects.JDBC: subject = "JDBC";
                break;
//            case Subjects.HTML:subject = "HTML";
        }
        System.out.println("전달받은 과목 : " + subject);
    }
}
