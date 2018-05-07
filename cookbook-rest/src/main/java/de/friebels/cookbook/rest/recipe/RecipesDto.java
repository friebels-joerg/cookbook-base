package de.friebels.cookbook.rest.recipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class RecipesDto implements  Iterable<RecipesEntryDto>{

    private List<RecipesEntryDto> recipes = new ArrayList<>();

    public void add(final RecipesEntryDto recipe) {
        recipes.add(recipe);
    }

    public int size() {
        return recipes.size();
    }

    @Override
    public Iterator<RecipesEntryDto> iterator() {
        return recipes.iterator();
    }
}
