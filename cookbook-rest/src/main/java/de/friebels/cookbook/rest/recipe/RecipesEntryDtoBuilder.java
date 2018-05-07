package de.friebels.cookbook.rest.recipe;

public class RecipesEntryDtoBuilder {

    private RecipesEntryDto recipe = new RecipesEntryDto();

    private RecipesEntryDtoBuilder() {
    }

    static RecipesEntryDtoBuilder builder() {
        return new RecipesEntryDtoBuilder();
    }

    public RecipesEntryDtoBuilder withName(final String name) {
        recipe.setName(name);
        return this;
    }

    public RecipesEntryDtoBuilder withId(final String id) {
        recipe.setId(id);
        return this;
    }

    public RecipesEntryDto build() {
        return recipe;
    }
}
