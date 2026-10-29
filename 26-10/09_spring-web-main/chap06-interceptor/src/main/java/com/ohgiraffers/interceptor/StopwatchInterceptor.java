package com.ohgiraffers.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class StopwatchInterceptor implements HandlerInterceptor {

    private static final String START_TIME = "startTime";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        long startTime = System.nanoTime();
        request.setAttribute(START_TIME, startTime);

        System.out.println("[Stopwatch] preHandle "
                + request.getMethod() + " " + request.getRequestURI());

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        Object startTimeAttribute = request.getAttribute(START_TIME);

        if (startTimeAttribute instanceof Long startTime) {
            long elapsedTime = (System.nanoTime() - startTime) / 1_000_000;

        System.out.println("[Stopwatch] afterCompletion "
                + request.getMethod() + " " + request.getRequestURI() + " " + elapsedTime);
        }

    }
}
