package com.example.mymessenger.maskhttp.schema;

import java.util.List;

public class StoreResult extends AbsMaskSchema {
    private Long totalPages;
    private Long totalCount;
    private Long page;
    private Long count;
    private List<Store> storeInfos;

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Store> getStoreInfos() {
        return storeInfos;
    }

    public void setStoreInfos(List<Store> storeInfos) {
        this.storeInfos = storeInfos;
    }
}
