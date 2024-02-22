package com.example.olxSearch.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RegionUrlsTest {

    @Mock
    private Environment environment;

    @InjectMocks
    private RegionUrls regionUrls;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetList() {
        // Mock the property value
        String[] urlsArray = {
                "https://www.olx.pl/api/v1/offers?offset=0&limit=40&category_id=15&region_id=6&filter_float_price%3Afrom=444&sort_by=filter_float_price%3Aasc",
                "https://www.olx.pl/api/v1/offers?offset=0&limit=40&category_id=15&region_id=13&filter_float_price%3Afrom=444&sort_by=filter_float_price%3Aasc"
        };
        List<String> expectedUrls = Arrays.asList(urlsArray);
        when(environment.getProperty("app.urls.regionUrls", String[].class)).thenReturn(urlsArray);

        // Call the method
        List<String> actualUrls = regionUrls.getList();

        // Verify the result
        assertEquals(expectedUrls, actualUrls);
    }
}