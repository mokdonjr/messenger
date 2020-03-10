package com.example.mymessenger.maskhttp.schema;

public class Sale extends AbsMaskSchema {
    // 식별 코드
    private String code;
    // 입고시간 ($YYYY/MM/DD HH:mm:ss)
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
