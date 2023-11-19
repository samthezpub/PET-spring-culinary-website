package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recepies")
public class RecepiesController {
    @Autowired
    private RecipeServiceImpl recipeService;
    @PostMapping(path = "/create")
    public String addRecipe(@ModelAttribute RecipeEntity recipe) {

        recipeService.createRecipe(recipe);
        return "redirect:/";
    }
}
