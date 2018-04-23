package de.friebels.cookbook.rest;

import com.fasterxml.jackson.annotation.JacksonInject;

public class RecipeJsonBuilder {

    private RecipeJson recipe = new RecipeJson();

    private RecipeJsonBuilder() {
    }

    static RecipeJsonBuilder builder() {
        return new RecipeJsonBuilder();
    }

    public RecipeJsonBuilder withName(final String name) {
        recipe.setName(name);
        return this;
    }

    public RecipeJsonBuilder withId(final String id) {
        recipe.setId(id);
        return this;
    }

    public RecipeJson build() {
        return recipe;
    }
}
