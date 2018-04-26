package de.friebels.cookbook.domain.recipe;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;

import org.apache.commons.lang3.StringUtils;

public class RecipeBuilder {

    private final Recipe recipe = new Recipe();

    public static RecipeBuilder builder() {
        return new RecipeBuilder();
    }

    private RecipeBuilder() {
    }

    public RecipeBuilder witId(final String id) {
        if (StringUtils.isNoneBlank(id)) {
            recipe.setId(Id.of(id));
        }
        return this;
    }

    public RecipeBuilder withName(final String name) {
        if (StringUtils.isNoneBlank(name)) {
            recipe.setName(Name.of(name));
        }
        return this;
    }

    public Recipe build() {
        return recipe;
    }

}
