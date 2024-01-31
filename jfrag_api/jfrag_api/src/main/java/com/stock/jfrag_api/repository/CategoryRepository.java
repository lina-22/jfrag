package com.stock.jfrag_api.repository;

import com.stock.jfrag_api.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
}
