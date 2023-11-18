package com.example.springrecipieswebappnew.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe")
@Entity
public class RecipeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private DishEntity dish;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
