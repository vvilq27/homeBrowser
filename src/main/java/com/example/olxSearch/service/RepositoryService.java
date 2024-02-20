package com.example.olxSearch.service;

import com.example.olxSearch.entity.HomeDocument;
import com.example.olxSearch.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryService {
//    @Autowired
//    private MongoTemplate mongoTemplate;

    HomeRepository homeRepository;
    public RepositoryService(HomeRepository homeRepository){
        this.homeRepository = homeRepository;
    }

    public void saveHome(HomeDocument home) {
        homeRepository.insert(home);
    }

    public void saveAllHomes(List<HomeDocument> homes) {
        homeRepository.insert(homes);
    }
}
