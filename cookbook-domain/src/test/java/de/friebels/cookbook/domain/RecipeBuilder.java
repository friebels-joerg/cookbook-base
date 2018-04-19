package de.friebels.cookbook.domain;

class RecipeBuilder {

    private final Recipe recipe;

    static RecipeBuilder recipeBuilder() {
        return new RecipeBuilder();
    }

    private RecipeBuilder() {
        recipe = new Recipe();
    }

    RecipeBuilder withId(String id) {
        return withId(Id.of(id));
    }

    RecipeBuilder withId(Id id) {
        recipe.setId(id);
        return this;
    }

    RecipeBuilder withName(String name) {
        return withName(Name.of(name));
    }

    RecipeBuilder withName(Name name) {
        recipe.setName(name);
        return this;
    }

    Recipe build() {
        return recipe;
    }
}
