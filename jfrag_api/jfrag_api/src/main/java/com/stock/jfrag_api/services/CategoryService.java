package com.stock.jfrag_api.services;

import com.stock.jfrag_api.model.CategoryModel;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    CategoryModel create(CategoryModel categoryModel);
    Optional<CategoryModel> findById(Long id);

    List<CategoryModel> findAll();

    CategoryModel update(CategoryModel categoryModel);

    void delete(Long id);


}
