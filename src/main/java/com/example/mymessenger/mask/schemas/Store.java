package com.example.mymessenger.mask.schemas;

public class Store extends AbsMaskSchema {
    // 식별코드
    private String code;
    // 이름
    private String name;
    // 주소
    private String addr;
    // 판매처 유형[약국: '01', 우체국: '02', 농협: '03']
    private String type;
    // 위도
    private Float lat;
    // 경도
    private Float lng;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }
}
