package com.example.mymessenger.common.service.http;

import com.example.mymessenger.BaseBeanTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HttpGateServiceTest extends BaseBeanTest {

    @Autowired
    private HttpGateService httpGateService;

    @Test
    public void testRequest() {
        httpGateService.getHttpService(HttpGateService.HttpMethodType.GET).request("http://localhost:8080/common/test", null);
    }
}
