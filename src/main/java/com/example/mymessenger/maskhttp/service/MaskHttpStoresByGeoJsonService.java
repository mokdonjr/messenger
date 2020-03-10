package com.example.mymessenger.maskhttp.service;

import org.springframework.stereotype.Service;

/**
 * 중심 좌표(위/경도)를 기준으로 반경(미터단위) 안에 존재하는 판매처 및 재고 상태 등의 판매 정보 제공
 */
@Service
public class MaskHttpStoresByGeoJsonService extends AbsMaskHttpService {
    @Override
    public MaskHttpURL getMaskHttpUrl() {
        return MaskHttpURL._storesByGeo_json;
    }

}
