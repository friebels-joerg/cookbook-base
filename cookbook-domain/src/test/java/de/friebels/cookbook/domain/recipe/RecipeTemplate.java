package de.friebels.cookbook.domain.recipe;

import de.friebels.cookbook.domain.Name;

public class RecipeTemplate {

    static final Recipe HUEHNERFRIKASSE = Recipe.create()
            .setName(Name.of("Hühnerfrikasse"));
}

