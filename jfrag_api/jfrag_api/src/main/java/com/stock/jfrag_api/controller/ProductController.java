package com.stock.jfrag_api.controller;


import com.stock.jfrag_api.model.ProductModel;
import com.stock.jfrag_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/addProduct")
    public ResponseEntity<String> saveProduct(@RequestBody List<ProductModel> products){
        productRepository.saveAll(products);
        return ResponseEntity.ok("Product svaed");
    }
}
