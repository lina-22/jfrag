package com.stock.jfrag_api.controller;

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
    private CategoryRepository categoryRepository;

    @PostMapping("/add-category")
    public CategoryModel saveProduct(@RequestBody CategoryModel categoryModel){
//       return categoryRepository.saveAll(categoryModel);
        return categoryRepository.save(categoryModel);

    }
}
