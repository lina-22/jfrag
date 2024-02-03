package com.stock.jfrag_api.manager;

import com.stock.jfrag_api.dto.CategoryDto;
import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryManager {

    private CategoryService categoryService;

    public CategoryDto createCategory(CategoryDto categoryDto){

        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setName(categoryDto.getName());
//test -
        return categoryDto;
    }

}
