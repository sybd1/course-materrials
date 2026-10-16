package com.ohgiraffers.section03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    // 선언하지 않은 것 허용
//    @Override
//    public void method() {
//    }

    // 같은 범위 허용
//    @Override
//    public void method() throws IOException {}

    // 부모보다 더 구체적인 범위는 허용
    public void method() throws FileNotFoundException {}

    // 부모보다 더 넓은 범위는 허용하지 않는다.
//    public void method() throws Exception {}

}
