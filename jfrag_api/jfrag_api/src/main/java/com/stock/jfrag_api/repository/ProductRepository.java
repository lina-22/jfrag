package com.stock.jfrag_api.repository;

import com.stock.jfrag_api.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
