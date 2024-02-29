package com.woowa.client.httpbin.adapter;

import com.woowa.client.httpbin.response.AnythingResponse;
import com.woowa.client.support.WireMockSupport;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.SocketTimeoutException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class HttpBinFeignClientIntegrationTest extends WireMockSupport {
    @Autowired
    HttpBinFeignClient httpBinFeignClient;

    @Test
    @DisplayName("getAnythingById 1 정상 조회")
    void getAnythingById_1() {
        // when
        AnythingResponse response = httpBinFeignClient.getAnythingById(1L);

        // then
        assertThat(response)
                .as("응답이 null 이 아님")
                .isNotNull()
                .as("data 가 비어있음")
                .extracting(AnythingResponse::getData)
                .isEqualTo(Strings.EMPTY);
    }

    @Test
    @DisplayName("getAnythingById 2 Timeout 발생")
    void getAnythingById_2() {
        // when
        Throwable throwable = catchThrowable(() -> httpBinFeignClient.getAnythingById(2L));

        // then
        assertThat(throwable)
                .as("SocketTimeoutException 발생")
                .hasCauseInstanceOf(SocketTimeoutException.class)
                .hasMessageContaining("Read timed out");
    }
}