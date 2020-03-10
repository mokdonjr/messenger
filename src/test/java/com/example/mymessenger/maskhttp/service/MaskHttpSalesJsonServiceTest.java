package com.example.mymessenger.maskhttp.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MaskHttpSalesJsonServiceTest extends AbsMaskHttpServiceTest {
    @Autowired
    private MaskHttpSalesJsonService maskHttpSalesJsonService;

    @Override
    protected IMaskHttpService getMaskHttpService() {
        return maskHttpSalesJsonService;
    }

    @Override
    protected Map<Object, Object> getDefaultParam() {
        var params = new HashMap<>();
        params.put("page", 2);
        params.put("perPage", 50);
        return params;
    }
}
