package com.stock.jfrag_api.controller;

import com.stock.jfrag_api.dto.StockDto;
import com.stock.jfrag_api.manager.StockManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockManager stockManager;
    @PostMapping("/add-stock")
    public StockDto createStock(@RequestBody StockDto stockDto){
        return stockManager.createStock(stockDto);
    }

    @GetMapping
    public List<StockDto> getAllStock(){

        return stockManager.getAllStock();
    }

    @GetMapping(path = "/{id}")
    public StockDto getStockById(@PathVariable long id){

        return stockManager.getStockById(id);
    }
}
