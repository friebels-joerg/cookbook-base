package de.friebels.cookbook.domain.recipe;

import de.friebels.cookbook.domain.Name;

import org.apache.commons.lang3.StringUtils;

public class RecipeListEntryBuilder {

    private final RecipeListEntry recipe= new RecipeListEntry();

    public static RecipeListEntryBuilder builder() {
        return new RecipeListEntryBuilder();
    }

    private RecipeListEntryBuilder() {
    }

    public RecipeListEntryBuilder withName(final String name) {
        if (StringUtils.isNoneBlank(name)) {
            recipe.setName(Name.of(name));
        }
        return this;
    }

    public RecipeListEntry build() {
        return recipe;
    }

}
