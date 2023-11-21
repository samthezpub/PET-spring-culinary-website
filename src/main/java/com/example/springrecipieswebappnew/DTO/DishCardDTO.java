package com.example.springrecipieswebappnew.DTO;

import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Entity.UserEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class DishCardDTO {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Long categoryId;

    private UserDTO user;
    private List<RecepieDishDTO> recipes;

    public DishCardDTO(Long id, String name, String description, String imageUrl, Long categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
    }

    public DishCardDTO(Long id, String name, String description, String imageUrl, Long categoryId, UserDTO user, List<RecepieDishDTO> recipes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
        this.user = user;
        this.recipes = recipes;
    }
}
