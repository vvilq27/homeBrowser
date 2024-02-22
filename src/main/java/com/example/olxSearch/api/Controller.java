package com.example.olxSearch.api;

import com.example.olxSearch.dto.HomeDto;
import com.example.olxSearch.service.DownloadDataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    private DownloadDataService downloadDataService;

    public Controller(DownloadDataService downloadDataService) {
        this.downloadDataService = downloadDataService;
    }

    @GetMapping(path = "test")
    List<HomeDto> test(){
        return downloadDataService.getRegionData();
    }
}

