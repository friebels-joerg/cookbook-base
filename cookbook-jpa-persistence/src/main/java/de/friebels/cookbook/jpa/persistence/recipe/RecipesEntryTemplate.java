package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.RecipesEntry;

public class RecipesEntryTemplate {

    public static final RecipesEntry HUEHNERFRIKASSE = RecipesEntry.create().setName(Name.of("Hühnerfrikasse")).setId(
            Id.generate());
}
