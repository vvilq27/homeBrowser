package com.example.olxSearch.api;

import com.example.olxSearch.dto.HomeDao;
import com.example.olxSearch.entity.HomeDocument;
import com.example.olxSearch.mapper.DaoToEntityMapper;
import com.example.olxSearch.mapper.DaoToEntityMapperImpl;
import com.example.olxSearch.service.RepositoryService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {
    private final RestTemplate restTemplate;
    private ObjectMapper objectMapper;
    private RepositoryService repositoryService;
    @Autowired
    private DaoToEntityMapper daoToEntityMapper;

//    public Controller(RestTemplate restTemplate, ObjectMapper objectMapper, RepositoryService repositoryService, DaoToEntityMapper daoToEntityMapper) {
//        this.restTemplate = restTemplate;
//        this.objectMapper = objectMapper;
//        this.repositoryService = repositoryService;
//        this.daoToEntityMapper = daoToEntityMapper;
//    }

    public Controller(RestTemplate restTemplate, ObjectMapper objectMapper, RepositoryService repositoryService) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
        this.repositoryService = repositoryService;
    }

    @GetMapping(path = "test")
    List<HomeDao> test(){
        System.out.println("request received");
        List<HomeDao> homes = new ArrayList<>();
        List<HomeDocument> homeDocuments;

        Set<HomeDocument> uniqueHomes = new LinkedHashSet<>();

        ResponseEntity<String> response = restTemplate.exchange(
                "https://www.olx.pl/api/v1/offers?offset=0&limit=40&category_id=15&region_id=13",
                HttpMethod.GET,
                null,
                String.class
        );

        //todo: filter unique homes
        try {
            JsonNode root = objectMapper.readTree(response.getBody());
            JsonNode dataNode = root.get("data");

            System.out.println(String.format("raw homes size %d", dataNode.size()));

            for (JsonNode itemNode : dataNode) {
                HomeDao home = objectMapper.treeToValue(itemNode, HomeDao.class);

                homes.add(home);
                uniqueHomes.add(daoToEntityMapper.mapToEntity(home));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        homeDocuments = new ArrayList<>(uniqueHomes);
        System.out.println(String.format("raw homes size %d", homes.size()));


//        repositoryService.saveHome(homeDocuments.get(0));
        repositoryService.saveAllHomes(homeDocuments);

        return homes;
    }
}

