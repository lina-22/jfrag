package com.stock.jfrag_api.controller;

import com.stock.jfrag_api.model.StockModel;
import com.stock.jfrag_api.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    StockRepository stockRepository;
    @PostMapping("/add-stock")
    public StockModel stockModel(@RequestBody StockModel stockModel){

        return stockRepository.save(stockModel);
    }
}
