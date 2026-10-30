package com.ohgiraffers.restapi.section02.valid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
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
@ToString(exclude = "pwd")
public class UserDTO {

    private Integer no;

    @NotBlank(message = "아이디는 반드시 입력되어야 합니다.")
    private String id;

    @NotBlank(message = "비밀번호는 반드시 입력되어야 합니다.")
    @Size(max = 10, message = "비밀번호는 길이 10을 초과할 수 없습니다.")
    private String pwd;

    @NotBlank(message = "이름은 반드시 입력되어야 합니다.")
    @Size(max = 10, message = "이름은 길이 10을 초과할 수 없습니다.")
    private String name;

    @NotNull(message = "가입일은 반드시 입력되어야 합니다.")
    @Past(message = "가입일은 현재보다 과거 날짜가 입력 되어야 합니다.")
    private Date enrollDate;

}
