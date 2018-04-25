package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.recipe.Recipe;
import de.friebels.cookbook.domain.recipe.RecipeListEntry;

public class RecipeTemplate {

    static final Recipe HUEHNERFRIKASSE = RecipeBuilder.builder().withName("Hühnerfrikasse").build();
}
