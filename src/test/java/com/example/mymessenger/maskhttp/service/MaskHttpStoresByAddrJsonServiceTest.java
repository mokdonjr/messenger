package com.example.mymessenger.maskhttp.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MaskHttpStoresByAddrJsonServiceTest extends AbsMaskHttpServiceTest {
    @Autowired
    private MaskHttpStoresByAddrJsonService maskHttpStoresByAddrJsonService;

    @Override
    protected IMaskHttpService getMaskHttpService() {
        return maskHttpStoresByAddrJsonService;
    }

    @Override
    protected Map<Object, Object> getDefaultParam() {
        var param = new HashMap<>();
        param.put("address", "서울시 동작구 상도로 53길 8");
        return param;
    }
}
