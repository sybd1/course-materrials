package com.ohgiraffers.restapi.section03.swagger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResponseMessage {

    private int httpStatus;
    private String message;
    private Map<String, Object> results;
}
