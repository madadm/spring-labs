package com.cydeo;

import com.cydeo.config.ReadConfig;
import com.cydeo.entity.Recipe;
import com.cydeo.service.RecipeService;
import com.cydeo.service.RecipeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RecipeDemo {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(RecipeDemo.class, args);

        RecipeServiceImpl recipeService = container.getBean(RecipeServiceImpl.class);


        recipeService.prepareRecipe();

        ReadConfig readConfig= container.getBean(ReadConfig.class);

        System.out.println(readConfig.getName());

    }





}
