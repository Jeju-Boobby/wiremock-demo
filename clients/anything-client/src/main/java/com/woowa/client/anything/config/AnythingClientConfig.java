package com.woowa.client.anything.config;

import com.woowa.client.anything.adapter.AnythingFeignClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = {AnythingFeignClient.class})
public class AnythingClientConfig {

}
