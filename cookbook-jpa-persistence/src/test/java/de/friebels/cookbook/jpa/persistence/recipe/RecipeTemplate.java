package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.recipe.Recipe;

public class RecipeTemplate {

    static final Recipe HUEHNERFRIKASSE = RecipeBuilder.builder().withName("Hühnerfrikasse").build();
}
