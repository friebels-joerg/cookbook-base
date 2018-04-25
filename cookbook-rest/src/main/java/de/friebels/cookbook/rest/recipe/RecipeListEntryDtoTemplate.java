package de.friebels.cookbook.rest.recipe;

import java.util.UUID;

public class RecipeListEntryDtoTemplate {

    static final RecipeListEntryDto HUEHNERFRIKASSE =
            RecipeListEntryDtoBuilder.builder().withName("Hühnerfrikassee").withId(UUID.randomUUID().toString()).build();
}
