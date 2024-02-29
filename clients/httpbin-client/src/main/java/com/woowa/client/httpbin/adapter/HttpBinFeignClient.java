package com.woowa.client.httpbin.adapter;

import com.woowa.client.httpbin.request.AnythingRequest;
import com.woowa.client.httpbin.response.AnythingResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "httpBinClient", url = "${client.httpbin-api.access-url}", decode404 = true)
public interface HttpBinFeignClient {
    @GetMapping("/anything/{id}")
    AnythingResponse getAnythingById(@PathVariable("id") Long id);

    @PostMapping("/anything")
    AnythingResponse postAnything(@RequestBody AnythingRequest request);
}
