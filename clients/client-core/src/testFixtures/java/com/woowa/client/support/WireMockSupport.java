package com.woowa.client.support;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@AutoConfigureWireMock(port = 0, stubs = "classpath:mappings")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class WireMockSupport {
}
