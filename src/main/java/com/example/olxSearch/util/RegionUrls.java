package com.example.olxSearch.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

//@Component
public class RegionUrls {
//    @Value("${regionUrls}")
    private List<String> regionUrls;

    //shoud you test @value returning function?
    public List<String> getList() {
        return this.regionUrls;
    }

    public void setList(List<String> list) {
        this.regionUrls = list;
    }
}