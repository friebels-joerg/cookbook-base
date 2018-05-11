package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.DetailedRecipe;

public class DetailedRecipeTemplate {

    public static final DetailedRecipe HUEHNERFRIKASSE = DetailedRecipe.create().setName(Name.of("Hühnerfrikasse"));
}
