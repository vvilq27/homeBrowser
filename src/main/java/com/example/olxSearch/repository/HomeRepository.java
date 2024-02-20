package com.example.olxSearch.repository;

import com.example.olxSearch.entity.HomeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HomeRepository extends MongoRepository<HomeDocument, String> {
}
