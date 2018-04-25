package de.friebels.cookbook.rest.recipe;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class RecipeListDto {

    private List<RecipeListEntryDto> recipes = new ArrayList<>();

    public void add(final RecipeListEntryDto recipe) {
        recipes.add(recipe);
    }
}
