package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.DTO.DishCardDTO;
import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Service.impl.DishServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
public class DishesController {
    private final DishServiceImpl dishService;

    public DishesController(DishServiceImpl dishService) {
        this.dishService = dishService;
    }
    @GetMapping("/dishes")
    @ResponseBody
    public List<DishCardDTO> getDishesByCategoryId(@RequestParam Long category_id){
        List<DishEntity> dishesByCategoryId = dishService.findDishesByCategoryId(category_id);

        List<DishCardDTO> dishCardDTOS = new ArrayList<>();
        for (DishEntity dish: dishesByCategoryId) {
            dishCardDTOS.add(
                    new DishCardDTO(dish.getId(), dish.getName(), dish.getDescription(), dish.getImageUrl(), dish.getCategory().getId())
            );
        }
        return dishCardDTOS;
    }
}
