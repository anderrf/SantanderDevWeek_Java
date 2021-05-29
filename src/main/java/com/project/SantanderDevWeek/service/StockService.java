package com.project.SantanderDevWeek.service;

import com.project.SantanderDevWeek.mapper.StockMapper;
import com.project.SantanderDevWeek.model.Stock;
import com.project.SantanderDevWeek.model.dto.StockDTO;
import com.project.SantanderDevWeek.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    @Autowired
    private StockMapper mapper;

    @Transactional
    public StockDTO save(StockDTO dto) {
        Stock stock = mapper.toEntity(dto);
        repository.save(stock);
        //dto.setId(stock.getId());
        return mapper.toDto(stock);
    }

}
