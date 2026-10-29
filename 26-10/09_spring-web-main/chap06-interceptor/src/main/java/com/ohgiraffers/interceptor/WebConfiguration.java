package com.ohgiraffers.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /* 인터셉터는 WebMVCConfigurer의 addInterceptors()에서 등록하고
     * 적용할 URL 패턴을 지정해야 한다.*/

    private final StopwatchInterceptor stopwatchInterceptor;
    private final ApiKeyInterceptor apiKeyInterceptor;

    public WebConfiguration(StopwatchInterceptor stopwatchInterceptor, ApiKeyInterceptor apiKeyInterceptor) {
        this.stopwatchInterceptor = stopwatchInterceptor;
        this.apiKeyInterceptor = apiKeyInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(stopwatchInterceptor)
                .addPathPatterns("/api/v1/**")
                .order(1);

        registry.addInterceptor(apiKeyInterceptor)
                .addPathPatterns("/api/v1/admin/**")
                .order(2);
    }
}
