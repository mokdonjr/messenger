package com.example.mymessenger.common.service.http;

import com.example.mymessenger.BaseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HttpGateService extends BaseBean {

    public enum HttpMethodType {
        GET,
        POST,
        ;
    }

    @Autowired
    private HttpGetService httpGetService;

    @Autowired
    private HttpPostService httpPostService;

    public IHttpService getHttpService(HttpMethodType httpMethodType) {
        switch (httpMethodType) {
            case GET: return httpGetService;
            case POST: return httpPostService;
            default: return null;
        }
    }
}
