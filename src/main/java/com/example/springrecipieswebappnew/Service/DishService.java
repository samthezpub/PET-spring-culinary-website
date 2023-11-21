package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DishService {
    void createDish(DishEntity dish);
    Optional<DishEntity> findDishById(Long id);
    List<DishEntity> findDishesByCategoryId(Long categoryId);
    void updateDish(DishEntity dish);
    void deleteDish(DishEntity dish);
}
