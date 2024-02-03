package com.stock.jfrag_api.controller;

import com.stock.jfrag_api.dto.CategoryDto;
import com.stock.jfrag_api.manager.CategoryManager;
import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryManager categoryManager;

    @PostMapping("/add-category")
    public CategoryDto saveProduct(@RequestBody CategoryDto categoryDto){
        return categoryManager.createCategory(categoryDto);

    }
}
