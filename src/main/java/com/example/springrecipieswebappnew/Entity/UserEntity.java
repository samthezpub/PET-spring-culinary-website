package com.example.springrecipieswebappnew.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("user")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password_encoded")
    private String password_encoded;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<DishEntity> dishes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RecipeEntity> recipes;
}
