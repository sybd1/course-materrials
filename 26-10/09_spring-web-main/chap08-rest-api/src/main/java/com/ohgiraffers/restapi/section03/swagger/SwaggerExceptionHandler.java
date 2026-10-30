package com.ohgiraffers.restapi.section03.swagger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice(basePackageClasses = SwaggerTestController.class)
public class SwaggerExceptionHandler {

    @ExceptionHandler(SwaggerUserNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleUserNotFound(
            SwaggerUserNotFoundException exception) {

        Map<String, Object> error = new LinkedHashMap<>();
        error.put("status", HttpStatus.NOT_FOUND.value());
        error.put("error", HttpStatus.NOT_FOUND.name());
        error.put("message", exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
