package com.example.springrecipieswebappnew.Service.impl;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Repository.DishRepository;
import com.example.springrecipieswebappnew.Service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private final DishRepository dishRepository;

    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    /**
     * @param dish
     */
    @Override
    public void createDish(DishEntity dish) {
        dishRepository.save(dish);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<DishEntity> findDishById(Long id) {
        return dishRepository.findById(id);
    }

    /**
     * @param categoryId
     * @return
     */
    @Override
    public List<DishEntity> findDishesByCategoryId(Long categoryId) {
        return dishRepository.findDishesByCategoryId(categoryId).orElse(Collections.emptyList());
    }


    /**
     * @param dish
     */
    @Override
    public void updateDish(DishEntity dish) {
        dishRepository.save(dish);
    }

    /**
     * @param dish
     */
    @Override
    public void deleteDish(DishEntity dish) {
        dishRepository.delete(dish);
    }
}
