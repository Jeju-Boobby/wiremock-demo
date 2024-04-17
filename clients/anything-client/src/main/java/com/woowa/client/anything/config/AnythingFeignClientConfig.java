package com.woowa.client.anything.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class AnythingFeignClientConfig {
    @Bean
    @Profile("test")
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("type", "anything");
    }
}
