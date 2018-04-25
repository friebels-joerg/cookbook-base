package de.friebels.cookbook.rest.recipe;

import java.util.UUID;

public class RecipeDtoTemplate {

    static final RecipeDto HUEHNERFRIKASSE =
            RecipeDtoBuilder.builder().withName("Hühnerfrikasee").withId(UUID.randomUUID().toString()).build();
}
