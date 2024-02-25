package com.example.olxSearch.api;

import com.example.olxSearch.dto.HomeDto;
import com.example.olxSearch.service.DownloadDataService;
import com.example.olxSearch.service.RepositoryService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    private DownloadDataService downloadDataService;
    private RepositoryService repositoryService;

    public Controller(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @GetMapping("/homes")
    Page<HomeDto> getRegionHomes(
            @RequestParam("regionName") String regionName,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "pageSize", defaultValue = "100") int pageSize)
    {
        return repositoryService.getHomesPageByRegion(regionName, page, pageSize);
    }
}

