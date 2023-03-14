package com.cydeo.service;

import com.cydeo.entity.Ingredients;
import com.cydeo.entity.QuantityType;
import com.cydeo.entity.Recipe;

import com.cydeo.proxy.ShareService;
import com.cydeo.repository.RecipeRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

import static com.cydeo.entity.QuantityType.*;
import static com.cydeo.entity.RecipeType.*;


@Component
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepositoryImpl;
    private final ShareService shareService;
    private final Faker javaFaker;


    public RecipeServiceImpl(RecipeRepository recipeRepositoryImpl, @Qualifier("facebook") ShareService shareService, Faker javaFaker) {
        this.recipeRepositoryImpl = recipeRepositoryImpl;
        this.shareService = shareService;
        this.javaFaker = javaFaker;
    }

    @Override
    public boolean prepareRecipe() {

        UUID id = new UUID(10,20);

        int recipeType = new Random().nextInt(10);

//        List<>

        Recipe recipe = new Recipe(String.valueOf(id), javaFaker.food().dish(),
                new Random().nextInt(4), prepareIngredient(), (recipeType<3)?BREAKFAST:(recipeType<6)?LUNCH:SOUP);


        shareService.share(recipe);
        recipeRepositoryImpl.saveRecipe(recipe);

        return true;
    }



    private List<Ingredients> prepareIngredient(){
        List<Ingredients> ingredientsList = new ArrayList<>();
        List<QuantityType> quantityTypes = List.of(QuantityType.values());

        int quantityType = new Random().nextInt(10);
        for(int i = 0; i < new Random().nextInt(10);i++){
                    ingredientsList.add(new Ingredients(javaFaker.food().ingredient(), new Random().nextInt(10)
                    , quantityTypes.get(new Random().nextInt(3))) );
        }

        return ingredientsList;
    }

}
