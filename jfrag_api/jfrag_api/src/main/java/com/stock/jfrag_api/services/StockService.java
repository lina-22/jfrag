package com.stock.jfrag_api.services;

import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.model.StockModel;

import java.util.List;
import java.util.Optional;

public interface StockService {

    StockModel create(StockModel stockModel);
    Optional<StockModel> findById(Long id);
    List<StockModel> findAll();
    StockModel update(StockModel stockModel);

    void delete(Long id);

}
