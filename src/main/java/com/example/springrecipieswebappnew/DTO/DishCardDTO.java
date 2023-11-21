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
@AllArgsConstructor
public class DishCardDTO {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Long categoryId;


}
