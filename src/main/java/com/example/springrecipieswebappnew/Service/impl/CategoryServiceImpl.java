package com.example.springrecipieswebappnew.Service.impl;

import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import com.example.springrecipieswebappnew.Repository.CategoryRepository;
import com.example.springrecipieswebappnew.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    /**
     * @param category
     */
    @Override
    public void createCategory(CategoryEntity category) {

    }


    /**
     * @param id
     * @return
     */
    @Override
    public Optional<CategoryEntity> findCategoryById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CategoryEntity> findAllCategories() {
        return categoryRepository.findAll();
    }

    /**
     * @param category
     */
    @Override
    public void updateCategory(CategoryEntity category) {

    }

    /**
     * @param category
     */
    @Override
    public void deleteCategory(CategoryEntity category) {

    }

    /**
     * @return
     */

}
