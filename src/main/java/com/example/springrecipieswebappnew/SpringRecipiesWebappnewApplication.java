package com.example.springrecipieswebappnew;

import com.example.springrecipieswebappnew.Entity.DishEntity;
import com.example.springrecipieswebappnew.Service.impl.DishServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRecipiesWebappnewApplication {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(SpringRecipiesWebappnewApplication.class, args);
        DishServiceImpl bean = run.getBean(DishServiceImpl.class);
        bean.createDish(new DishEntity());
    }

}
