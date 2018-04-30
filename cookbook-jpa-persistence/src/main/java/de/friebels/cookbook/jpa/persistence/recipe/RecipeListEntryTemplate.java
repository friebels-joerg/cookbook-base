package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.RecipeListEntry;

public class RecipeListEntryTemplate {

    static final RecipeListEntry HUEHNERFRIKASSE = RecipeListEntry.create().setName(Name.of("Hühnerfrikasse"));
}
