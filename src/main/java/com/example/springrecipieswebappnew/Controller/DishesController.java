package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.DTO.DishCardDTO;
import com.example.springrecipieswebappnew.DTO.RecepieDishDTO;
import com.example.springrecipieswebappnew.DTO.UserDTO;
import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Service.impl.DishServiceImpl;
import com.example.springrecipieswebappnew.Service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DishesController {
    @Autowired
    private final DishServiceImpl dishService;

    @Autowired
    private final RecipeServiceImpl recipeService;

    public DishesController(DishServiceImpl dishService, RecipeServiceImpl recipeService) {
        this.dishService = dishService;
        this.recipeService = recipeService;
    }

    @GetMapping("/dishes")
    @ResponseBody
    public List<DishCardDTO> getDishesByCategoryId(@RequestParam Long category_id) {
        List<DishEntity> dishesByCategoryId = dishService.findDishesByCategoryId(category_id);

        List<DishCardDTO> dishCardDTOS = new ArrayList<>();
        for (DishEntity dish : dishesByCategoryId) {
            dishCardDTOS.add(
                    new DishCardDTO(dish.getId(), dish.getName(), dish.getDescription(), dish.getImageUrl(), dish.getCategory().getId())
            );
        }
        return dishCardDTOS;
    }

    @GetMapping("/getbyid")
    @ResponseBody
    public DishCardDTO getDishById(@RequestParam Long id) {
        DishEntity dishById = null;
        DishCardDTO dishCardDTO = null;

        try {
            dishById = dishService.findDishById(id);
        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            dishCardDTO = new DishCardDTO(dishById.getId(),
                    dishById.getName(),
                    dishById.getDescription(),
                    dishById.getImageUrl(),
                    dishById.getCategory().getId(),
                    new UserDTO(dishById.getUser().getId(), dishById.getUser().getName()),
                    recipeService.findRecipiesByDishId(id).stream().map(recipe -> {
                        return new RecepieDishDTO(recipe.getId(),
                                recipe.getContent(),
                                recipe.getDish(),
                                new UserDTO(recipe.getUser().getId(),
                                        recipe.getUser().getName())
                        );
                    }).collect(Collectors.toList())
            );

        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }

        return dishCardDTO;
    }
}
