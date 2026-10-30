package com.ohgiraffers.restapi.section01.responseentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "pwd")
public class UserRequestDTO {

    /* 클라이언트가 회원 등록·수정 요청으로 보내는 값만 담는다. */
    private String id;
    private String pwd;
    private String name;
    private String status;
}
