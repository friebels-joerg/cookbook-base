package de.friebels.cookbook.domain.recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeList {

    private List<RecipeListEntry> recipes = new ArrayList<>();

    public void add(final RecipeListEntry recipe) {
        recipes.add(recipe);
    }
}
