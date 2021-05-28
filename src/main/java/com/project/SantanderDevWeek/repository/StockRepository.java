package com.project.SantanderDevWeek.repository;

import com.project.SantanderDevWeek.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {



}
