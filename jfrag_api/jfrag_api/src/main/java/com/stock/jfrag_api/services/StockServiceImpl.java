package com.stock.jfrag_api.services;

import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.model.StockModel;
import com.stock.jfrag_api.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StockServiceImpl implements StockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public StockModel create(StockModel stockModel) {
        return stockRepository.save(stockModel);
    }

    @Override
    public Optional<StockModel> findById(Long id) {
        return stockRepository.findById(id);
    }

    @Override
    public List<StockModel> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public StockModel update(StockModel stockModel) {
        return stockRepository.saveAndFlush(stockModel);
    }

    @Override
    public void delete(Long id) {
       stockRepository.findById(id);
    }
}
