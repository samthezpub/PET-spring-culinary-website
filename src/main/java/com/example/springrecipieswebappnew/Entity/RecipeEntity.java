package com.example.springrecipieswebappnew.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
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

    @JsonIgnore
    @Nullable
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Override
    public String toString() {
        return "RecipeEntity{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", dish=" + dish.getId() +
                ", user=" + user.getId() +
                '}';
    }
}
