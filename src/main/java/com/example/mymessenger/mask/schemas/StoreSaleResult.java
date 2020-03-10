package com.example.mymessenger.mask.schemas;

import java.util.List;

public class StoreSaleResult extends AbsMaskSchema {
    private Long count;
    private List<StoreSale> stores;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<StoreSale> getStores() {
        return stores;
    }

    public void setStores(List<StoreSale> stores) {
        this.stores = stores;
    }
}
