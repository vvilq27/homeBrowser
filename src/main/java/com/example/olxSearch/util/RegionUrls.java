package com.example.olxSearch.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@ConfigurationProperties(prefix = "app")
public class RegionUrls {

//      - 'https://www.olx.pl/api/v1/offers?offset=0&limit=40&category_id=15&region_id=4&filter_float_price%3Afrom=444&sort_by=filter_float_price%3Aasc'
//              - 'https://www.olx.pl/api/v1/offers?offset=0&limit=40&category_id=15&region_id=2&city_id=17871&filter_float_price%3Afrom=444&sort_by=filter_float_price%3Aasc'
//              - 'https://www.olx.pl/api/v1/offers?offset=0&limit=40&category_id=15&region_id=7&filter_float_price%3Afrom=444&sort_by=filter_float_price%3Aasc'

    @Value("${regionUrls}")
    private List<String> regionUrls;

    //how to test @value returning function?
    public List<String> getList() {
        return this.regionUrls;
    }

    public void setList(List<String> list) {
        this.regionUrls = list;
    }
}