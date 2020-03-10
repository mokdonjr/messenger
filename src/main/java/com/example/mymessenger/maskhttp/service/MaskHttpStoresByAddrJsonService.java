package com.example.mymessenger.maskhttp.service;

import org.springframework.stereotype.Service;

/**
 * 주소를 기준으로 해당 구 또는 동내에 존재하는 판매처 및 재고 상태 등의 판매 정보 제공.
 * 예- '서울특별시 강남구' or '서울특별시 강남구 논현동'
 * ('서울특별시' 와 같이 '시'단위만 입력하는 것은 불가능합니다.)
 */
@Service
public class MaskHttpStoresByAddrJsonService extends AbsMaskHttpService {
    @Override
    public MaskHttpURL getMaskHttpUrl() {
        return MaskHttpURL._storesByAddr_json;
    }

}
