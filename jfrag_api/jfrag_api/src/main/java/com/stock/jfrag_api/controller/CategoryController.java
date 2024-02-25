package com.stock.jfrag_api.controller;

import com.stock.jfrag_api.dto.CategoryDto;
import com.stock.jfrag_api.manager.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public List<CategoryDto> getAllCategory(){

        return categoryManager.getAllCategory();
    }

    @GetMapping(path = "/{id}")
    public CategoryDto getCategoryById(@PathVariable long id){

        return categoryManager.getCategoryById(id);
    }

    @PutMapping("/update-category")
    public CategoryDto updateCategoryById(@RequestBody CategoryDto categoryDto){

        return categoryManager.updateCategory(categoryDto);
    }
    @DeleteMapping(path ="/{id}")
    public ResponseEntity<String> deleteCategoryById(@PathVariable long id){
        try{
            categoryManager.deleteCategoryById(id);
            return new ResponseEntity<>("Category with id+ " + id + "has been deleted successfully.", HttpStatus.OK);
        }catch (Exception excp){
            System.out.println(excp.getMessage());
            return new ResponseEntity<>("Category with " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
