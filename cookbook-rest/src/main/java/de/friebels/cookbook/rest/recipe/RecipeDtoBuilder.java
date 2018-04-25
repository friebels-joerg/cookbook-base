package de.friebels.cookbook.rest.recipe;

public class RecipeDtoBuilder {

    private RecipeDto recipe = new RecipeDto();

    private RecipeDtoBuilder() {
    }

    static RecipeDtoBuilder builder() {
        return new RecipeDtoBuilder();
    }

    public RecipeDtoBuilder withName(final String name) {
        recipe.setName(name);
        return this;
    }

    public RecipeDtoBuilder withId(final String id) {
        recipe.setId(id);
        return this;
    }

    public RecipeDto build() {
        return recipe;
    }
}
