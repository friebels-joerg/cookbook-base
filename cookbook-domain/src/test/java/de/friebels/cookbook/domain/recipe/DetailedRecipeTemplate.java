package de.friebels.cookbook.domain.recipe;

import de.friebels.cookbook.domain.Name;

public class DetailedRecipeTemplate {

    static final DetailedRecipe HUEHNERFRIKASSE = DetailedRecipe.create()
            .setName(Name.of("Hühnerfrikasse"));
}

