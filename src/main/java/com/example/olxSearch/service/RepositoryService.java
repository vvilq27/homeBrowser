package com.example.olxSearch.service;

import com.example.olxSearch.dto.HomeDto;
import com.example.olxSearch.entity.HomeDocument;
import com.example.olxSearch.mapper.DtoToEntityMapper;
import com.example.olxSearch.repository.HomeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepositoryService {
    HomeRepository homeRepository;
    DtoToEntityMapper homeMapper;

    MongoTemplate mongoTemplate;

    public RepositoryService(HomeRepository homeRepository, DtoToEntityMapper homeMapper, MongoTemplate mongoTemplate) {
        this.homeRepository = homeRepository;
        this.homeMapper = homeMapper;
        this.mongoTemplate = mongoTemplate;
    }

    public void saveHome(HomeDocument home) {
        homeRepository.insert(home);
    }

    public void saveAllHomes(List<HomeDocument> homes) {
        homeRepository.insert(homes);
    }

    public List<HomeDto> getHomesByRegion(String regionName){
        List<HomeDocument> homeEntities = homeRepository.findByRegionNormalizedName(regionName);

        List<HomeDto> homeDtos = homeEntities.stream()
                .map(entity -> homeMapper.mapToDto(entity))
                .toList();

        return homeDtos;
    }

    public Page<HomeDto> getHomesPageByRegion(String regionName, String extractionDate, int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);

        Page<HomeDocument> homeDocumentsPage =
                homeRepository.findByRegionNormalizedNameAndExtractionDate(regionName, extractionDate, pageRequest);

        return homeDocumentsPage.map(homeMapper::mapToDto);
    }

    public List<String> getAvailableRegions(){
        return mongoTemplate.query(HomeDocument.class)
                .distinct("location.region.normalized_name")
                .as(String.class)
                .all();
    }

    public List<String> getAllExtractionDates(){
        return mongoTemplate.query(HomeDocument.class)
                .distinct("extractionDate")
                .as(String.class)
                .all();
    }
}
