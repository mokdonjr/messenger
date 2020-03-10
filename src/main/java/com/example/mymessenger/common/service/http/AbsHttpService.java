package com.example.mymessenger.common.service.http;

import com.example.mymessenger.BaseBean;

import java.io.IOException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public abstract class AbsHttpService extends BaseBean implements IHttpService {

    protected boolean isEnabled = true;

    protected abstract HttpRequest getHttpRequest(String url, Map<Object, Object> param);

    @Override
    public void request(String url, Map<Object, Object> param) {
        sendHttpRequest(getHttpRequest(url, param));
    }

    private void sendHttpRequest(HttpRequest httpRequest) {
        long startAt = System.currentTimeMillis();
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        HttpResponse<String> httpResponse = null;
        try {
            if (isEnabled) {
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        long duration = System.currentTimeMillis() - startAt;
        if (httpResponse == null) {
            logger.info("[HTTP_RESPONSE] duration:{} response is null", duration);
        } else {
            logger.info("[HTTP_RESPONSE] duration:{} response status:{} body:{}", duration, httpResponse.statusCode(), httpResponse.body());
        }
    }

    /**
     * 파라미터 만들기
     * @param param
     * @return
     */
    protected String requestParams(Map<Object, Object> param) {
        var sb = new StringBuffer();
        if (param != null) {
            for (Map.Entry<Object, Object> entry : param.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
            }
        }
        return sb.toString();
    }
}
