package com.example.springrecipieswebappnew.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dish")
@Entity
public class DishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @JsonIgnore
    @Nullable
    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
    private List<RecipeEntity> recipes;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @Override
    public String toString() {
        return "DishEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", user=" + user + '\'' +
                ", recipes=" + recipes.stream().map(RecipeEntity::getId).collect(Collectors.toList()) +'\'' +
                ", category=" + category.getId() +'\'' +
                '}';
    }
}
