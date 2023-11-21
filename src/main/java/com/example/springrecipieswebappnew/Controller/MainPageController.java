package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.Entity.CategoryEntity;
import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Service.impl.CategoryServiceImpl;
import com.example.springrecipieswebappnew.Service.impl.DishServiceImpl;
import com.example.springrecipieswebappnew.Service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    private final CategoryServiceImpl categoryService;

    public MainPageController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "/")
    public String showMainPage(Model model) {
        List<CategoryEntity> allCategories = categoryService.findAllCategories();

        model.addAttribute("categoryList", allCategories);

        return "home";
    }

}
