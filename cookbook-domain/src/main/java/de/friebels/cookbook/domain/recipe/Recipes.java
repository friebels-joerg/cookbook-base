package de.friebels.cookbook.domain.recipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Recipes implements Iterable<RecipesEntry> {

    private List<RecipesEntry> recipes = new ArrayList<>();

    public void add(final RecipesEntry recipe) {
        recipes.add(recipe);
    }

    public int size() {
        return recipes.size();
    }

    @Override
    public Iterator<RecipesEntry> iterator() {
        return recipes.iterator();
    }
}
