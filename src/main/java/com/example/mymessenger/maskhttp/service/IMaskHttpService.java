package com.example.mymessenger.maskhttp.service;

import com.example.mymessenger.maskhttp.service.AbsMaskHttpService.MaskHttpURL;

import java.net.http.HttpResponse;
import java.util.Map;

public interface IMaskHttpService {

    public MaskHttpURL getMaskHttpUrl();

    /**
     * 공적 마스크 API 요청후 응답 가져오기
     * @param params 파라미터 순서대로 입력
     * @return
     * @throws Exception
     */
    public HttpResponse<String> request(String ... params) throws Exception;
    public HttpResponse<String> request(Map<Object, Object> params) throws Exception;
}
