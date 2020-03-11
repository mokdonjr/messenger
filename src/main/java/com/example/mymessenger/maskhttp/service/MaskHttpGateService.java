package com.example.mymessenger.maskhttp.service;

import com.example.mymessenger.common.BaseBean;
import com.example.mymessenger.maskhttp.service.AbsMaskHttpService.MaskHttpURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 공적마스크 API 연동 서비스
 */
@Service
public class MaskHttpGateService extends BaseBean {

    @Autowired
    private MaskHttpStoreJsonService maskHttpStoreJsonService;
    @Autowired
    private MaskHttpSalesJsonService maskHttpSalesJsonService;
    @Autowired
    private MaskHttpStoresByGeoJsonService maskHttpStoresByGeoJsonService;
    @Autowired
    private MaskHttpStoresByAddrJsonService maskHttpStoresByAddrJsonService;

    public IMaskHttpService getMaskHttpService(MaskHttpURL maskHttpURL) {
        switch (maskHttpURL) {
            case _sales_json: return maskHttpSalesJsonService;
            case _stores_json: return maskHttpStoreJsonService;
            case _storesByGeo_json: return maskHttpStoresByGeoJsonService;
            case _storesByAddr_json: return maskHttpStoresByAddrJsonService;
            default: return null;
        }
    }
}
