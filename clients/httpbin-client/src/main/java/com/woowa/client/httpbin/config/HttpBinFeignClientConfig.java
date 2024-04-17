package com.woowa.client.httpbin.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class HttpBinFeignClientConfig {
    @Bean
    @Profile("test")
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("type", "http-bin");
    }
}
