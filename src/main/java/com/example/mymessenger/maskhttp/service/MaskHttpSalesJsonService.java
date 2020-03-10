package com.example.mymessenger.maskhttp.service;

import org.springframework.stereotype.Service;

/**
 * 마스크 재고 상태 등의 판매 정보 제공(판매처 관련 정보는 제공하지 않음)
 */
@Service
public class MaskHttpSalesJsonService extends AbsMaskHttpService {
    @Override
    public MaskHttpURL getMaskHttpUrl() {
        return MaskHttpURL._sales_json;
    }

}
