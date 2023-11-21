package com.example.springrecipieswebappnew.Repository;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity, Long> {
    @Query("SELECT r FROM RecipeEntity r WHERE r.dish.id = :id")
    Optional<List<RecipeEntity>> findRecipeEntitiesByDishId(@Param("id") Long id);
}
