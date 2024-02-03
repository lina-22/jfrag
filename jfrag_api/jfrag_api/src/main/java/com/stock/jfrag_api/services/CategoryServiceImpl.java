package com.stock.jfrag_api.services;

import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryModel create(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    @Override
    public Optional<CategoryModel> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<CategoryModel> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryModel update(CategoryModel categoryModel) {
        return categoryRepository.saveAndFlush(categoryModel);
    }

    @Override
    public void delete(Long id) {
       categoryRepository.deleteById(id);
    }
}
