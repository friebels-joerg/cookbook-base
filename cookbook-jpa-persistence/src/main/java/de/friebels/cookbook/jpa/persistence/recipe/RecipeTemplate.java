package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.Recipe;

public class RecipeTemplate {

    public static final Recipe HUEHNERFRIKASSE = Recipe.create().setName(Name.of("Hühnerfrikasse")).setId(
            Id.generate());
}
