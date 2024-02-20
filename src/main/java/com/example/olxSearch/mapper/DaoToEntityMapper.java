package com.example.olxSearch.mapper;


import com.example.olxSearch.dto.HomeDao;
import com.example.olxSearch.entity.HomeDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Bean;

@Mapper(componentModel = "spring")
public interface DaoToEntityMapper {
    @Mapping(target = "id", source = "dao.id")
    @Mapping(target = "url", source = "dao.url")
    @Mapping(target = "title", source = "dao.title")
    @Mapping(target = "last_refresh_time", source = "dao.last_refresh_time")
    @Mapping(target = "created_time", source = "dao.created_time")
    @Mapping(target = "valid_to_time", source = "dao.valid_to_time")
    @Mapping(target = "pushup_time", source = "dao.pushup_time")
    @Mapping(target = "description", source = "dao.description")
    @Mapping(target = "promotion", source = "dao.promotion")
    @Mapping(target = "params", source = "dao.params")
    @Mapping(target = "key_params", source = "dao.key_params")
    @Mapping(target = "business", source = "dao.business")
    @Mapping(target = "user", source = "dao.user")
    @Mapping(target = "status", source = "dao.status")
    @Mapping(target = "contact", source = "dao.contact")
    @Mapping(target = "map", source = "dao.map")
    @Mapping(target = "location", source = "dao.location")
    @Mapping(target = "photos", source = "dao.photos")
    @Mapping(target = "partner", source = "dao.partner")
    @Mapping(target = "category", source = "dao.category")
    @Mapping(target = "delivery", source = "dao.delivery")
    @Mapping(target = "safedeal", source = "dao.safedeal")
    @Mapping(target = "shop", source = "dao.shop")
    @Mapping(target = "offer_type", source = "dao.offer_type")
    HomeDocument mapToEntity(HomeDao dao);
}
