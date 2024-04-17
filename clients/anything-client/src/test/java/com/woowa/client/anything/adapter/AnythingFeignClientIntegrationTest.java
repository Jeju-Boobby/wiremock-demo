package com.woowa.client.anything.adapter;

import com.woowa.client.anything.response.AnythingResponse;
import com.woowa.client.support.WireMockSupport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class AnythingFeignClientIntegrationTest extends WireMockSupport {
    @Autowired
    AnythingFeignClient anythingFeignClient;

    @Test
    @DisplayName("getAnythingById 1 정상 조회")
    void getAnythingById_1() {
        // when
        AnythingResponse response = anythingFeignClient.getAnythingById(1L);

        // then
        assertThat(response)
                .as("응답이 null 이 아님")
                .isNotNull()
                .as("data 가 AnythingFeignClient 임")
                .extracting(AnythingResponse::getData)
                .isEqualTo("AnythingFeignClient");
    }
}