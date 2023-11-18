package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface DishService {
    void createDish(DishEntity dish);
    Optional<DishEntity> findDishById(Long id);
    void updateDish(DishEntity dish);
    void deleteDish(DishEntity dish);
}
