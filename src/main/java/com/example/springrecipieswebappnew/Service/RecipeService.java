package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RecipeService {
    void createRecipe(RecipeEntity recipe);
    Optional<RecipeEntity> findRecipeById(Long id);
    void updateRecipe(RecipeEntity recipe);
    void deleteRecipe(RecipeEntity recipe);
}
