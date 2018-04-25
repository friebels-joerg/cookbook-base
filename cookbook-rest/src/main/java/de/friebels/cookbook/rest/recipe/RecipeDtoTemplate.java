package de.friebels.cookbook.rest.recipe;

import java.util.UUID;

public class RecipeDtoTemplate {

    static final RecipeDto HUEHNERFRIKASSE =
            RecipeDtoBuilder.builder().withName("Hühnerfrikassee").withId(UUID.randomUUID().toString()).build();
}
