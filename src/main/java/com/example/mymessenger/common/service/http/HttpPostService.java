package com.example.mymessenger.common.service.http;

import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Map;

@Service
public class HttpPostService extends AbsHttpService {

    @Override
    protected HttpRequest getHttpRequest(String url, Map<Object, Object> param) {
        String requestParams = requestParams(param);
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(requestParams))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .build();
        return httpRequest;
    }
}
