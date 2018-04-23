package de.friebels.cookbook.rest;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class RecipesJson {

    private List<RecipeJson> recipes = new ArrayList<>();

    public void add(final RecipeJson recipe) {
        recipes.add(recipe);
    }
}
