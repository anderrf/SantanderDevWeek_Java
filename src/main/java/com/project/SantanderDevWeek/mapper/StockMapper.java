package com.project.SantanderDevWeek.mapper;

import com.project.SantanderDevWeek.model.Stock;
import com.project.SantanderDevWeek.model.dto.StockDTO;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setDate(dto.getDate());
        stock.setVariation(dto.getVariation());
        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setPrice(stock.getPrice());
        dto.setDate(stock.getDate());
        dto.setVariation(stock.getVariation());
        return dto;
    }
}
