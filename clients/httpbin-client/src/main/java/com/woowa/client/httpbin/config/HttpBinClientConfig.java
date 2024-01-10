package com.woowa.client.httpbin.config;

import com.woowa.client.httpbin.adapter.HttpBinFeignClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = {HttpBinFeignClient.class})
public class HttpBinClientConfig {

}
