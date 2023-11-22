package com.example.springrecipieswebappnew.Service;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishService {
    void createDish(DishEntity dish);
    DishEntity findDishById(Long id) throws ChangeSetPersister.NotFoundException;
    List<DishEntity> findDishesByCategoryId(Long categoryId);
    void updateDish(DishEntity dish);
    void deleteDish(DishEntity dish);
}
