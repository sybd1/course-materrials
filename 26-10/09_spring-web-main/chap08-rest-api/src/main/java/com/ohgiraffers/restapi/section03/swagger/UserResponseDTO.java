package com.ohgiraffers.restapi.section03.swagger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserResponseDTO {

    private int no;
    private String id;
    private String name;
    private Date enrollDate;
    private String status;
}
