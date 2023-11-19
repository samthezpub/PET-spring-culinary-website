package com.example.springrecipieswebappnew.Controller;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Entity.RecipeEntity;
import com.example.springrecipieswebappnew.Service.impl.DishServiceImpl;
import com.example.springrecipieswebappnew.Service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainPageController {

    @GetMapping(path = "/")
    public String showMainPage(Model model) {
        return "home";
    }

}
