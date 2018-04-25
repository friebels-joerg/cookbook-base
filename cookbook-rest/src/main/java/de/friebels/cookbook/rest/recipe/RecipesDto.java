package de.friebels.cookbook.rest.recipe;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class RecipesDto {

    private List<RecipeDto> recipes = new ArrayList<>();

    public void add(final RecipeDto recipe) {
        recipes.add(recipe);
    }
}
