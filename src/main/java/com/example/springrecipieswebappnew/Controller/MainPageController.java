package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainPageController {
    @Autowired
    private RecipeServiceImpl recipeService;

    @GetMapping(path = "/")
    public String showMainPage(Model model){
        return "home";
    }

    @PostMapping(path = "/recepies/create")
    public RedirectView addRecipe(@ModelAttribute RecipeEntity recipe){
        recipeService.createRecipe(recipe);
        return new RedirectView("/");
    }
}
