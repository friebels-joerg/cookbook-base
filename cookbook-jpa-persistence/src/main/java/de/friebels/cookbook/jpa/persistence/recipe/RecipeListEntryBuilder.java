package de.friebels.cookbook.jpa.persistence.recipe;

import java.util.UUID;

import de.friebels.cookbook.domain.Id;
import de.friebels.cookbook.domain.Name;
import de.friebels.cookbook.domain.recipe.RecipeListEntry;

import org.apache.commons.lang3.StringUtils;

class RecipeListEntryBuilder {

    private final RecipeListEntry recipe= new RecipeListEntry();

    static RecipeListEntryBuilder builder() {
        return new RecipeListEntryBuilder();
    }

    private RecipeListEntryBuilder() {
    }

    public RecipeListEntryBuilder withId(final Id id) {
        if (id != null && StringUtils.isNoneBlank(id.getValue())) {
            recipe.setId(id);
        }
        return this;
    }

    RecipeListEntryBuilder withName(final String name) {
        if (StringUtils.isNoneBlank(name)) {
            recipe.setName(Name.of(name));
        }
        return this;
    }

    RecipeListEntry build() {
        return recipe;
    }

}
