package com.example.mymessenger.common.service.http;

import com.example.mymessenger.common.BaseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class HttpGateService extends BaseBean {

    @Autowired
    private HttpGetService httpGetService;

    @Autowired
    private HttpPostService httpPostService;

    public IHttpService getHttpService(HttpMethod httpMethod) {
        switch (httpMethod) {
            case GET: return httpGetService;
            case POST: return httpPostService;
            default: return null;
        }
    }
}
