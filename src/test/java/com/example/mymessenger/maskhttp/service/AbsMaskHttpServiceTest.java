package com.example.mymessenger.maskhttp.service;

import com.example.mymessenger.BaseBeanTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public abstract class AbsMaskHttpServiceTest extends BaseBeanTest {
    protected abstract IMaskHttpService getMaskHttpService();
    protected abstract Map<Object, Object> getDefaultParam();

    /**
     * (테스트를 위한 테스트..)
     * 테스트용 파라미터 검증
     */
    @Test
    public void testDefaultParam() {
        Map<String, Boolean> paramCheck = new HashMap<>();
        var expectedParamNames = getMaskHttpService().getMaskHttpUrl().getRequestParams();
        for (var pn : expectedParamNames) {
            paramCheck.put(pn, false);
        }
        var params = getDefaultParam();
        Assertions.assertEquals(getMaskHttpService().getMaskHttpUrl().getRequestParams().length, params.size());
        for (var pn : paramCheck.entrySet()) {
            Assertions.assertTrue(params.containsKey(pn.getKey()));
        }
    }

    /**
     * 디폴트 파라미터로 요청해보기
     */
    @Test
    public void testRequestDefaultParam() throws Exception {
        var param = getDefaultParam();
        var response = getMaskHttpService().request(param);
        Assertions.assertNotNull(response);
        logger.info("[TEST_MASK_HTTP_RESPONSE] {}", response.body());
        Assertions.assertEquals(200, response.statusCode());
    }


}
