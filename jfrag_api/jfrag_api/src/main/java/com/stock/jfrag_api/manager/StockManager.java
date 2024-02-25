package com.stock.jfrag_api.manager;

import com.stock.jfrag_api.dto.CategoryDto;
import com.stock.jfrag_api.dto.StockDto;
import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.model.StockModel;
import com.stock.jfrag_api.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StockManager {
  private StockService stockService;

    public StockDto createStock(StockDto stockDto){
        StockModel stockToAdd = toStockModel(stockDto);
        StockModel addedStock= stockService.create(stockToAdd);
        return toStockDto(addedStock);
    }

    public List<StockDto> getAllStock() {
        List<StockDto>stockDtoList = new ArrayList<>();
        List<StockModel> stockModelList = stockService.findAll();
        stockModelList.forEach(data-> {
            stockDtoList.add(toStockDto(data));
        });
        return stockDtoList;
    }

    public StockDto getStockById(long id){

        return toStockDto(stockService.findById(id).get());
    }

    //    ******************* dto to model data transfer *************
    public StockModel toStockModel(StockDto stockDto){
        StockModel stockModel = new StockModel();
        stockModel.setQuantity(stockDto.getQuantity());
        return stockModel;
    }
//    ******************* dto to model data transfer end *************
//    ******************* model to dto data with is transfer *************
    public StockDto toStockDto(StockModel stockModel){
        StockDto stockDto = new StockDto();
        stockDto.setId(stockModel.getId());
        stockDto.setQuantity(stockModel.getQuantity());
        return  stockDto;
    }

//    ******************* model to dto data transfer end *************

}
