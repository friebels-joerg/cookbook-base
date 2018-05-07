package de.friebels.cookbook.rest.recipe;

import java.util.UUID;

public class RecipesEntryDtoTemplate {

    static final RecipesEntryDto HUEHNERFRIKASSE =
            RecipesEntryDtoBuilder.builder().withName("Hühnerfrikassee").withId(UUID.randomUUID().toString()).build();
}
