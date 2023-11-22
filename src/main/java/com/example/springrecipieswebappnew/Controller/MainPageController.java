package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import com.example.springrecipieswebappnew.Service.impl.CategoryServiceImpl;
import com.example.springrecipieswebappnew.Service.impl.DishServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    private final CategoryServiceImpl categoryService;

    @Autowired
    private final DishServiceImpl dishService;

    public MainPageController(CategoryServiceImpl categoryService, DishServiceImpl dishService) {
        this.categoryService = categoryService;
        this.dishService = dishService;
    }

    @GetMapping(path = "/")
    public String showMainPage(Model model) {
        List<CategoryEntity> allCategories = categoryService.findAllCategories();

        model.addAttribute("categoryList", allCategories);

        return "home";
    }

}
