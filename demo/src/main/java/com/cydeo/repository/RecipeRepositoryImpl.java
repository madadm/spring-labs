package com.cydeo.repository;

import com.cydeo.entity.Recipe;
import com.cydeo.proxy.ShareService;
import org.springframework.stereotype.Component;

import static com.cydeo.StaticConstants.RECIPE_DB;

@Component
public class RecipeRepositoryImpl implements RecipeRepository {


    @Override
    public void saveRecipe( Recipe recipe) {
        RECIPE_DB.add(recipe);
        System.out.println("Saving recipe " + recipe + " into Database");
    }

}
