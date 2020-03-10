package com.example.mymessenger.common.service.http;

import com.example.mymessenger.BaseBeanTest;
import com.example.mymessenger.common.service.http.HttpGateService.HttpMethodType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HttpGateServiceTest extends BaseBeanTest {

    @Autowired
    private HttpGateService httpGateService;

    @Test
    public void testRequest() {
        var response = httpGateService.getHttpService(HttpMethodType.GET).request("http://localhost:8080/common/test", null);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.statusCode());
    }
}
