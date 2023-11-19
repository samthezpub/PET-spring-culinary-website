package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;

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

    @GetMapping(path = "/get")
    public ResponseEntity<String> getRecipe(@RequestParam Long id) {
        recipeService.findRecipeById(id);

        String htmlResponse = recipeService.toString();

        ResponseEntity<String> body = ResponseEntity.ok().body(htmlResponse);
        return body;
    }

    @GetMapping(path = "/update")
    public ResponseEntity<String> updateRecipe(@RequestParam RecipeEntity recipe){
        recipeService.updateRecipe(recipe);

        String htmlResponse = recipeService.toString();

        return ResponseEntity.ok().body(htmlResponse);
    }

    @GetMapping(path = "/delete")
    public String deleteRecipe(@RequestParam RecipeEntity recipe){
        recipeService.deleteRecipe(recipe);

        return "redirect:/";
    }
}
