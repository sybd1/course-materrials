package com.ohgiraffers.restapi.section03.swagger;

public class SwaggerUserNotFoundException extends RuntimeException {

    public SwaggerUserNotFoundException(String message) {
        super(message);
    }
}
