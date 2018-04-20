package de.friebels.cookbook.jpa.persistence;

import de.friebels.cookbook.domain.Recipe;

public class RecipeTemplate {

    static final Recipe HUEHNERFRIKASSE = RecipeBuilder.builder().withName("Hühnerfrikasse").build();
}
