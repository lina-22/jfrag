package com.stock.jfrag_api.services;

import com.stock.jfrag_api.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductModel create(ProductModel productModel);

    Optional<ProductModel> findById(Long id);

    List<ProductModel> findAll();

    ProductModel update(ProductModel productModel);

    void delete(Long id);

}
