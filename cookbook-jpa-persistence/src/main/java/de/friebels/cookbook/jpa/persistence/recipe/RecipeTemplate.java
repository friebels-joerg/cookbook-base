package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.Recipe;
import de.friebels.cookbook.domain.recipe.RecipeListEntry;

public class RecipeTemplate {

    static final Recipe HUEHNERFRIKASSE = Recipe.create().setName(Name.of("Hühnerfrikasse"));
}
