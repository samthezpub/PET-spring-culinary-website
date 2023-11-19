package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {
    void createCategory(CategoryEntity category);
    Optional<CategoryEntity> findCategoryById(Long id);
    void updateCategory(CategoryEntity category);
    void deleteCategory(CategoryEntity category);
    List<CategoryEntity> findAllCategories();
}
