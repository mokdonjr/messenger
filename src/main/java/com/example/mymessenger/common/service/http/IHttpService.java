package com.example.mymessenger.common.service.http;

import java.util.Map;

public interface IHttpService {

    public void request(String url, Map<Object, Object> param);
}
