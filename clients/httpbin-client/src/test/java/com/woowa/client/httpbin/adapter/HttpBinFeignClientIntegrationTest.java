package com.woowa.client.httpbin.adapter;

import com.woowa.client.httpbin.response.AnythingResponse;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HttpBinFeignClientIntegrationTest {
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
}