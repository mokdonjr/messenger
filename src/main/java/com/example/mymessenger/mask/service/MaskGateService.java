package com.example.mymessenger.mask.service;

import com.example.mymessenger.BaseBean;
import org.springframework.stereotype.Service;

/**
 * 공적마스크 데이터 서비스
 * https://app.swaggerhub.com/apis/Promptech/public-mask-info/20200307-oas3#/v1/get_stores_json
 */
@Service
public class MaskGateService extends BaseBean {

    public static final String MASK_SERVER_URL = "https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1";

}
