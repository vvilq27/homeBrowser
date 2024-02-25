package com.example.olxSearch.repository;

import com.example.olxSearch.entity.HomeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepository extends MongoRepository<HomeDocument, String> {
    @Query("{'location.region.normalized_name': ?0}")
    List<HomeDocument> findByRegionNormalizedName(String regionNormalizedName);
}
