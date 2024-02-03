package com.stock.jfrag_api.services;

import com.stock.jfrag_api.model.ProductModel;
import com.stock.jfrag_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductModel create(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    @Override
    public Optional<ProductModel> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductModel update(ProductModel productModel) {
        return productRepository.saveAndFlush((productModel));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
