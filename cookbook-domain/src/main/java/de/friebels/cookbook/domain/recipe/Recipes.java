package de.friebels.cookbook.domain.recipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recipes implements Iterable<Recipe> {

    private List<Recipe> recipes = new ArrayList<>();

    public void add(final Recipe recipe) {
        recipes.add(recipe);
    }

    public int size() {
        return recipes.size();
    }

    @Override
    public Iterator<Recipe> iterator() {
        return recipes.iterator();
    }
}
