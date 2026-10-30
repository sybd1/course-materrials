package com.ohgiraffers.restapi.section01.responseentity;

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

    /* 클라이언트에게 공개해도 되는 회원 정보만 담는다. 비밀번호는 포함하지 않는다. */
    private Integer no;
    private String id;
    private String name;
    private Date enrollDate;
    private String status;
}
