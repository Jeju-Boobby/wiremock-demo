package com.woowa.client.httpbin.request;

import lombok.Getter;

@Getter
public class AnythingRequest {
    private final String data;

    public AnythingRequest(String data) {
        this.data = data;
    }
}
