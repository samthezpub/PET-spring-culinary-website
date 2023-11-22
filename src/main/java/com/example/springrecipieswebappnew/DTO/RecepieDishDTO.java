package com.example.springrecipieswebappnew.DTO;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Entity.UserEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RecepieDishDTO {
    private Long id;
    private String content;

    private DishEntity dish;

    private UserDTO user;
}
