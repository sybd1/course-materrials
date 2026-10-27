package com.ohgiraffers.exceptionhandler;

public class InvalidMemberRequestException extends RuntimeException {

    /* 클라이언트가 잘못된 회원 등록 요청 값을 보낸 상황을 의미하는 사용자 정의 예외 */
    public InvalidMemberRequestException(String message) {
        super(message);
    }
}
