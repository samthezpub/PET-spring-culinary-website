package com.example.springrecipieswebappnew.Repository;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DishRepository extends JpaRepository<DishEntity, Long> {
    @Query("SELECT d FROM DishEntity d WHERE d.category.id= :category_id")
    Optional<List<DishEntity>> findDishesByCategoryId(
           @Param("category_id") Long category_id
    );
}
