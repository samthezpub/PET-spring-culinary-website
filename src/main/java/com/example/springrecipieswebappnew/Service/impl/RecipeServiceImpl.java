package com.example.springrecipieswebappnew.Service.impl;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Repository.RecipeRepository;
import com.example.springrecipieswebappnew.Service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    /**
     * @param recipe
     */
    @Override
    public void createRecipe(RecipeEntity recipe) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<RecipeEntity> findRecipeById(Long id) {
        return Optional.empty();
    }

    /**
     * @param recipe
     */
    @Override
    public void updateRecipe(RecipeEntity recipe) {

    }

    /**
     * @param recipe
     */
    @Override
    public void deleteRecipe(RecipeEntity recipe) {

    }
}
