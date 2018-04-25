package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.Recipe;

public class RecipeBuilder {

    private Recipe recipe = new Recipe();

    public static RecipeBuilder builder() {
        return new RecipeBuilder();
    }

    public RecipeBuilder withName(final String name) {
        recipe.setName(Name.of(name));
        return this;
    }

    public Recipe build() {
        return recipe;
    }
}
