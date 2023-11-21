package com.example.springrecipieswebappnew.Service.impl;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Repository.DishRepository;
import com.example.springrecipieswebappnew.Repository.RecipeRepository;
import com.example.springrecipieswebappnew.Service.RecipeService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final DishRepository dishRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository, DishRepository dishRepository) {
        this.recipeRepository = recipeRepository;
        this.dishRepository = dishRepository;
    }

    /**
     * @param recipe
     */
    @Override
    public void createRecipe(RecipeEntity recipe) {
        recipeRepository.save(recipe);
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
     * @param id
     * @return
     * @throws ChangeSetPersister.NotFoundException
     */

    @Override
    public List<RecipeEntity> findRecipiesByDishId(Long id) throws ChangeSetPersister.NotFoundException {
        return recipeRepository.findRecipeEntitiesByDishId(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    /**
     * @param recipe
     */
    @Override
    public void updateRecipe(RecipeEntity recipe) {
        recipeRepository.save(recipe);
    }

    /**
     * @param recipe
     */
    @Override
    public void deleteRecipe(RecipeEntity recipe) {

    }
}
