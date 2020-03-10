package com.example.mymessenger.mask.schemas;

public class StoreSale extends AbsMaskSchema {
    // 식별 코드
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
    // 입고 시간 ($YYYY/MM/DD HH:mm:ss)
    private String stock_at;
    // 재고 상태[100개 이상(녹색): 'plenty' / 30개 이상 100개미만(노랑색): 'some' / 2개 이상 30개 미만(빨강색): 'few' / 1개 이하(회색): 'empty']
    private String remain_stat;
    // 데이터 생성 일자 ($YYYY/MM/DD HH:mm:ss)
    private String created_at;

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

    public String getStock_at() {
        return stock_at;
    }

    public void setStock_at(String stock_at) {
        this.stock_at = stock_at;
    }

    public String getRemain_stat() {
        return remain_stat;
    }

    public void setRemain_stat(String remain_stat) {
        this.remain_stat = remain_stat;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
