package com.example.olxSearch.service;

import com.example.olxSearch.dto.HomeDto;
import com.example.olxSearch.entity.HomeDocument;
import com.example.olxSearch.mapper.DtoToEntityMapper;
import com.example.olxSearch.repository.HomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryService {
    HomeRepository homeRepository;
    DtoToEntityMapper homeMapper;

    public RepositoryService(HomeRepository homeRepository, DtoToEntityMapper homeMapper) {
        this.homeRepository = homeRepository;
        this.homeMapper = homeMapper;
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
}
