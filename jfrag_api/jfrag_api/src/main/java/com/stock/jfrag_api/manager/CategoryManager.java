package com.stock.jfrag_api.manager;

import com.stock.jfrag_api.dto.CategoryDto;
import com.stock.jfrag_api.model.CategoryModel;
import com.stock.jfrag_api.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryManager {
    private CategoryService categoryService;
    public CategoryDto createCategory(CategoryDto categoryDto){
        CategoryModel categoryToAdd = toCategoryModel(categoryDto);
        CategoryModel addedCategory = categoryService.create(categoryToAdd);
        return toCategoryDto(addedCategory);
    }

    public List<CategoryDto> getAllCategory() {
        List<CategoryDto>categoryDtoList = new ArrayList<>();
        List<CategoryModel> categoryModelList = categoryService.findAll();
        categoryModelList.forEach(data-> {
            categoryDtoList.add(toCategoryDto(data));
        });
        return categoryDtoList;
    }

    public CategoryDto getCategoryById(long id){

        return toCategoryDto(categoryService.findById(id).get());
    }

    public CategoryDto updateCategory(CategoryDto categoryDto){
        Optional<CategoryModel> categoryModel =  categoryService.findById(categoryDto.getId());
        if (categoryModel.isPresent()){
            categoryModel.get().setName(categoryDto.getName());
            CategoryModel updatedCategoryModel =  categoryService.update(categoryModel.get());
            return toCategoryDto(updatedCategoryModel);
        }
        return new CategoryDto();

    }
    public void deleteCategoryById(long id){
        categoryService.delete(id);
    }
//    ********************* The dto to model data transfer ****************
      public CategoryModel toCategoryModel(CategoryDto categoryDto){
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setName(categoryDto.getName());
         return categoryModel;
//       return categoryService.create(categoryModel);
      }
//    ********************* The dto to model data transfer end ****************
//    ********************* The model to dto data transfer ********************
    public CategoryDto toCategoryDto(CategoryModel categoryModel){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(categoryModel.getId());
        categoryDto.setName(categoryModel.getName());
        return  categoryDto;
    }
//    ********************* The model to dto data transfer end ****************
}
