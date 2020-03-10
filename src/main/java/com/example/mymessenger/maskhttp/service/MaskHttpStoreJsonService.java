package com.example.mymessenger.maskhttp.service;

import org.springframework.stereotype.Service;

/**
 * 약국, 우체국, 농협 등의 마스크 판매처 정보 제공 (마스크 재고 관련 정보는 제공하지 않음)
 */
@Service
public class MaskHttpStoreJsonService extends AbsMaskHttpService {
    @Override
    public MaskHttpURL getMaskHttpUrl() {
        return MaskHttpURL._stores_json;
    }

}
