package com.ohgiraffers.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class ApiKeyInterceptor implements HandlerInterceptor {

    private static final String API_KEY_HEADER = "X-API-KEY";
    private static final String VALID_API_KEY = "secret-key";

    private final ObjectMapper objectMapper;

    public ApiKeyInterceptor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        String apiKey = request.getHeader(API_KEY_HEADER);

        if (VALID_API_KEY.equals(apiKey)) {
            System.out.println("[ApiKey] authorized"
                    + request.getMethod() + " " + request.getRequestURI());
            return true;
        }

        System.out.println("[ApiKey] authorized "
                + request.getMethod() + " " + request.getRequestURI());

        // false로 Controller를 막을 것이므로 상태, 형식, 본문을 여기서 직접 작성.
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");

        Map<String, Object> errorResponse = new LinkedHashMap<>();
        errorResponse.put("status", HttpStatus.UNAUTHORIZED.value());
        errorResponse.put("error", HttpStatus.UNAUTHORIZED.name());
        errorResponse.put("message", "관리자 API를 호출하려면 X-API-KEY 헤더가 필요합니다.");
        errorResponse.put("path", request.getRequestURI());

        // ObjectMapper로 오류 정보를 JSON 문자열로 직렬화 한다.
        // getWriter()로 얻은 writer가 그 문자열을 HTTP응답 본문에 쓴다.
        response.getWriter().write(objectMapper.writeValueAsString(errorResponse));

        return false;
    }

}
