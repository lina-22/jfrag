package com.stock.jfrag_api.repository;

import com.stock.jfrag_api.model.StockModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockModel, Long> {
}
