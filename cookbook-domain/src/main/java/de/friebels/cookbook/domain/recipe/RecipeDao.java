package de.friebels.cookbook.domain.recipe;

import de.friebels.cookbook.domain.Id;

public interface RecipeDao {
    Id save(Recipe recipe);

    Recipes get();
}
