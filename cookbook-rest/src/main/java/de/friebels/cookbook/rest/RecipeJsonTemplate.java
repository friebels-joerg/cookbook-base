package de.friebels.cookbook.rest;

import java.util.UUID;

public class RecipeJsonTemplate {

    static final RecipeJson HUEHNERFRIKASSE =
            RecipeJsonBuilder.builder().withName("Hühnerfrikasee").withId(UUID.randomUUID().toString()).build();
}
