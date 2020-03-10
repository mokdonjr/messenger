package com.example.mymessenger.maskhttp.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MaskHttpStoresByGeoJsonServiceTest extends AbsMaskHttpServiceTest {
    @Autowired
    private MaskHttpStoresByGeoJsonService maskHttpStoresByGeoJsonService;

    @Override
    protected IMaskHttpService getMaskHttpService() {
        return maskHttpStoresByGeoJsonService;
    }

    @Override
    protected Map<Object, Object> getDefaultParam() {
        var param = new HashMap<>();
        param.put("lat", 37.499154);
        param.put("lng", 126.954840);
        param.put("m", 5000);
        return param;
    }
}
