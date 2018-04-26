package de.friebels.cookbook.jpa.persistence.recipe;

import de.friebels.cookbook.domain.recipe.RecipeListEntry;
import de.friebels.cookbook.domain.recipe.RecipeListEntryBuilder;

public class RecipeListEntryTemplate {

    static final RecipeListEntry HUEHNERFRIKASSE = RecipeListEntryBuilder.builder().withName("Hühnerfrikasse").build();
}
