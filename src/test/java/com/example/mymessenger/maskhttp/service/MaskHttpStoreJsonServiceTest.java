package com.example.mymessenger.maskhttp.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MaskHttpStoreJsonServiceTest extends AbsMaskHttpServiceTest {
    @Autowired
    private MaskHttpStoreJsonService maskHttpStoreJsonService;

    @Override
    protected IMaskHttpService getMaskHttpService() {
        return maskHttpStoreJsonService;
    }

    @Override
    protected Map<Object, Object> getDefaultParam() {
        var param = new HashMap<>();
       param.put("page", 2);
       param.put("perPage", 10);
        return param;
    }
}
