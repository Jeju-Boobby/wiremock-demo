package com.woowa.application.internal.service;

import com.woowa.client.httpbin.adapter.HttpBinFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookQueryService {
    private final HttpBinFeignClient httpBinFeignClient;

    public Long findBookById(Long bookId) {
        httpBinFeignClient.getAnythingById(bookId);

        return bookId;
    }
}
