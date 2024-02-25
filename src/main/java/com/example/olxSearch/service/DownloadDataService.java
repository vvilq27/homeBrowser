package com.example.olxSearch.service;

import com.example.olxSearch.dto.HomeDto;
import com.example.olxSearch.entity.HomeDocument;
import com.example.olxSearch.mapper.DtoToEntityMapper;
import com.example.olxSearch.util.RegionUrls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class DownloadDataService {

    private final RestTemplate restTemplate;
    private ObjectMapper objectMapper;
    private RepositoryService repositoryService;
    private DtoToEntityMapper dtoToEntityMapper;
    private RegionUrls regionUrls;


    public DownloadDataService(RestTemplate restTemplate, ObjectMapper objectMapper, RepositoryService repositoryService, DtoToEntityMapper dtoToEntityMapper, RegionUrls regionUrls) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
        this.repositoryService = repositoryService;
        this.dtoToEntityMapper = dtoToEntityMapper;
        this.regionUrls = regionUrls;
    }

    public List<HomeDto> getRegionData(){
        List<HomeDto> homes = new ArrayList<>();
        List<HomeDocument> homeDocuments;
        Set<HomeDocument> uniqueHomes = new LinkedHashSet<>();

        ResponseEntity<String> response = getPageOfHomes();

        try {
            JsonNode root = objectMapper.readTree(response.getBody());
            JsonNode dataNode = root.get("data");

            System.out.println(String.format("raw homes size %d", dataNode.size()));

            for (JsonNode itemNode : dataNode) {
                HomeDto home = objectMapper.treeToValue(itemNode, HomeDto.class);

                homes.add(home);
                uniqueHomes.add(dtoToEntityMapper.mapToEntity(home));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        homeDocuments = new ArrayList<>(uniqueHomes);
        System.out.println(String.format("raw homes size %d", homes.size()));

        repositoryService.saveAllHomes(homeDocuments);

        return homes.subList(0,1);
    }

    private ResponseEntity<String> getPageOfHomes() {
        System.out.println(regionUrls.getList().get(0));

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
//                "localhost:9000/test",
                regionUrls.getList().get(0),
                HttpMethod.GET,
                entity,
                String.class
        );
        return response;
    }


}
