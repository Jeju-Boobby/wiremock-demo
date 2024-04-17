package com.woowa.client.anything.adapter;

import com.woowa.client.anything.config.AnythingFeignClientConfig;
import com.woowa.client.anything.response.AnythingResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "anythingClient", url = "${client.anything-api.access-url}", decode404 = true, configuration = {AnythingFeignClientConfig.class})
public interface AnythingFeignClient {
    @GetMapping("/anything/{id}")
    AnythingResponse getAnythingById(@PathVariable("id") Long id);
}
