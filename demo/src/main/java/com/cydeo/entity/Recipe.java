package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Recipe {
    private String id;
    private String name;
    private int duration;
    private List<Ingredients> ingredients;
    RecipeType recipeType;
}
