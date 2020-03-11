package com.example.mymessenger.maskhttp.service;

import com.example.mymessenger.common.BaseBean;
import com.example.mymessenger.common.service.http.HttpGateService;
import com.example.mymessenger.maskhttp.schema.IMaskSchema;
import com.example.mymessenger.maskhttp.schema.SaleResult;
import com.example.mymessenger.maskhttp.schema.StoreResult;
import com.example.mymessenger.maskhttp.schema.StoreSaleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public abstract class AbsMaskHttpService extends BaseBean implements IMaskHttpService {

    /**
     * 참고
     * https://app.swaggerhub.com/apis/Promptech/public-mask-info/20200307-oas3#/v1/get_stores_json
     */
    public static final String MASK_SERVER_URL = "https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1";

    @Autowired
    private HttpGateService httpGateService;

    public enum MaskHttpURL {
        _stores_json(
                "약국, 우체국, 농협 등의 마스크 판매처 정보 제공 (마스크 재고 관련 정보는 제공하지 않음)",
                HttpMethod.GET, MediaType.APPLICATION_JSON, StoreResult.class,
                "/stores/json",
                /*페이지 번호(default value:1)*/"page",
                /*한 페이지당 출력할 판매처 수[default: 500, min:500, max:5000]*/"perPage"),

        _sales_json(
                "마스크 재고 상태 등의 판매 정보 제공(판매처 관련 정보는 제공하지 않음)",
                HttpMethod.GET, MediaType.APPLICATION_JSON, SaleResult.class,
                "/sales/json",
                /*페이지 번호(default value:1)*/"page",
                /*한 페이지당 출력할 판매처 수[default: 500, min:500, max:5000]*/"perPage"),

        _storesByGeo_json(
                "중심 좌표(위/경도)를 기준으로 반경(미터단위) 안에 존재하는 판매처 및 재고 상태 등의 판매 정보 제공",
                HttpMethod.GET, MediaType.APPLICATION_JSON, StoreSaleResult.class,
                "/storesByGeo/json",
                /*위도(wgs84 좌표계) / 최소:33.0, 최대:43.0*/"lat",
                /*경도(wgs84 표준) / 최소:124.0, 최대:132.0*/"lng",
                /*반경(미터) / 최대 5000(5km)까지 조회 가능*/"m"),

        _storesByAddr_json(
                "주소를 기준으로 해당 구 또는 동내에 존재하는 판매처 및 재고 상태 등의 판매 정보 제공." +
                "예- '서울특별시 강남구' or '서울특별시 강남구 논현동'" +
                "('서울특별시' 와 같이 '시'단위만 입력하는 것은 불가능합니다.)",
                HttpMethod.GET, MediaType.APPLICATION_JSON, StoreSaleResult.class,
                "/storesByAddr/json",
                /*검색 기준이 될 주소*/"address"),
        ;

        private String description;
        private HttpMethod requestHttpMethod;
        private MediaType responseMediaType;
        private Class<?> responseMaskSchema;
        private String requestUrl;
        private String[] requestParams;

        <T extends IMaskSchema> MaskHttpURL(String description, HttpMethod requestHttpMethod, MediaType responseMediaType, Class<T> responseMaskSchema,
                                            String requestUrl, String ... requestParams) {
            this.description = description;
            this.requestHttpMethod = requestHttpMethod;
            this.responseMediaType = responseMediaType;
            this.responseMaskSchema = responseMaskSchema;
            this.requestUrl = requestUrl;
            this.requestParams = requestParams;
        }

        public String getDescription() {
            return description;
        }

        public HttpMethod getRequestHttpMethod() {
            return requestHttpMethod;
        }

        public MediaType getResponseMediaType() {
            return responseMediaType;
        }

        public Class<?> getResponseMaskSchema() {
            return responseMaskSchema;
        }

        public String getRequestUrl() {
            return requestUrl;
        }

        public String[] getRequestParams() {
            return requestParams;
        }
    }

    @Override
    public HttpResponse<String> request(String ... params) throws Exception {
        Map<Object, Object> paramBuilder = new HashMap<>();

        // param check
        if (params.length != getMaskHttpUrl().getRequestParams().length) {
            String errorMsg = "[MASK_HTTP] 파라미터 개수가 맞지 않습니다!!" +
                    "expected:" + getMaskHttpUrl().getRequestParams().length +
                    " actual:" + params.length;
            throw new Exception(errorMsg);
        }

        for (var paramName : getMaskHttpUrl().getRequestParams()) {
            paramBuilder.put(paramName, params);
        }

        return request(paramBuilder);
    }

    @Override
    public HttpResponse<String> request(Map<Object, Object> params) throws Exception {
        return httpGateService.getHttpService(getMaskHttpUrl().getRequestHttpMethod())
                .request(MASK_SERVER_URL + getMaskHttpUrl().getRequestUrl(), params);
    }
}
