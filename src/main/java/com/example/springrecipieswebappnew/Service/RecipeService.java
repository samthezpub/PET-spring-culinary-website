package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RecipeService {
    void createRecipe(RecipeEntity recipe);
    Optional<RecipeEntity> findRecipeById(Long id);

    List<RecipeEntity> findRecipiesByDishId(Long id) throws ChangeSetPersister.NotFoundException;

    void updateRecipe(RecipeEntity recipe);
    void deleteRecipe(RecipeEntity recipe);
}
