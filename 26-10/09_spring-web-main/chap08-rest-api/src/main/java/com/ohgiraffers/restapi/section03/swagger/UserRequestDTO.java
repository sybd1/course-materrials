package com.ohgiraffers.restapi.section03.swagger;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "회원 등록.수정 요청")
public class UserRequestDTO {

    @Schema(description = "회원ID", example = "user04")
    private String id;
    private String pwd;

    @Schema(description = "회원이름", example = "신규 회원")
    private String name;
    private String status;
}
