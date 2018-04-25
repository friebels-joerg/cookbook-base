package de.friebels.cookbook.rest.recipe;

public class RecipeListEntryDtoBuilder {

    private RecipeListEntryDto recipe = new RecipeListEntryDto();

    private RecipeListEntryDtoBuilder() {
    }

    static RecipeListEntryDtoBuilder builder() {
        return new RecipeListEntryDtoBuilder();
    }

    public RecipeListEntryDtoBuilder withName(final String name) {
        recipe.setName(name);
        return this;
    }

    public RecipeListEntryDtoBuilder withId(final String id) {
        recipe.setId(id);
        return this;
    }

    public RecipeListEntryDto build() {
        return recipe;
    }
}
