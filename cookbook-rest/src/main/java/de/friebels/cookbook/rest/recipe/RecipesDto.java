package de.friebels.cookbook.rest.recipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class RecipesDto implements  Iterable<RecipeDto>{

    private List<RecipeDto> recipes = new ArrayList<>();

    public void add(final RecipeDto recipe) {
        recipes.add(recipe);
    }

    public int size() {
        return recipes.size();
    }

    @Override
    public Iterator<RecipeDto> iterator() {
        return recipes.iterator();
    }
}
