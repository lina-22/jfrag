package com.stock.jfrag_api.controller;


import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.model.ProductModel;
import com.stock.jfrag_api.repository.CategoryRepository;
import com.stock.jfrag_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository  categoryRepository;

    @PostMapping("/add-product/{catId}")
    public ProductModel saveProduct(@RequestPart ProductModel product, @RequestPart MultipartFile image, @PathVariable Long catId) throws IOException {
        ProductModel productModel = new ProductModel();
        productModel.setName(product.getName());
        productModel.setPrice(product.getPrice());
        productModel.setDescription(product.getDescription());
        productModel.setImage(image.getBytes());


        CategoryModel categoryModel = categoryRepository.findById(catId).get();
        productModel.setCategoryModel(categoryModel);
        ProductModel savedProduct =  productRepository.saveAndFlush(productModel);


        System.out.println("test here : "  + savedProduct.toString());
       // categoryModel.setProductModel(List.of(savedProduct));
        //categoryRepository.saveAndFlush(categoryModel);

        // get category -

        return savedProduct;
        //return productRepository.save(productModel);
    }
}
