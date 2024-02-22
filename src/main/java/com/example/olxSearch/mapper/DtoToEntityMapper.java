package com.example.olxSearch.mapper;

import com.example.olxSearch.dto.HomeDto;
import com.example.olxSearch.entity.HomeDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DtoToEntityMapper {
    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "url", source = "dto.url")
    @Mapping(target = "title", source = "dto.title")
    @Mapping(target = "last_refresh_time", source = "dto.last_refresh_time")
    @Mapping(target = "created_time", source = "dto.created_time")
    @Mapping(target = "valid_to_time", source = "dto.valid_to_time")
    @Mapping(target = "pushup_time", source = "dto.pushup_time")
    @Mapping(target = "description", source = "dto.description")
    @Mapping(target = "promotion", source = "dto.promotion")
    @Mapping(target = "params", source = "dto.params")
    @Mapping(target = "key_params", source = "dto.key_params")
    @Mapping(target = "business", source = "dto.business")
    @Mapping(target = "user", source = "dto.user")
    @Mapping(target = "status", source = "dto.status")
    @Mapping(target = "contact", source = "dto.contact")
    @Mapping(target = "map", source = "dto.map")
    @Mapping(target = "location", source = "dto.location")
    @Mapping(target = "photos", source = "dto.photos")
    @Mapping(target = "partner", source = "dto.partner")
    @Mapping(target = "category", source = "dto.category")
    @Mapping(target = "delivery", source = "dto.delivery")
    @Mapping(target = "safedeal", source = "dto.safedeal")
    @Mapping(target = "shop", source = "dto.shop")
    @Mapping(target = "offer_type", source = "dto.offer_type")
    HomeDocument mapToEntity(HomeDto dto);
}
